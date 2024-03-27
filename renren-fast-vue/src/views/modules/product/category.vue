<template>
  <div>
    <!--添加拖拽开关和批量保存按钮-->
    <el-switch
      v-model="draggable"
      active-text="开启拖拽"
      inactive-text="关闭拖拽"
    >
    </el-switch>
    <el-button v-if="draggable" size="small" round @click="batchSave">
      批量保存
    </el-button>
    <el-button type="danger" size="small" @click="batchDelete" round>批量删除</el-button>
    <el-tree :data="data"
             :props="defaultProps"
             :expand-on-click-node="false"
             show-checkbox
             :draggable="draggable"
             :allow-drop="allowDrop"
             @node-drop="handleDrop"
             ref="menuTree"
             node-key="catId">
      <span class="custom-tree-node" slot-scope="{ node, data }">
      <span>{{ node.label }}</span>
      <span>
        <el-button
          type="text"
          v-if="node.level <= 2"
          size="mini"
          @click="() => handleAppend(data)"
        >
          添加
        </el-button>
        <el-button
          type="text"
          size="mini"
          @click="() => handleEdit(data)"
        >
          修改
        </el-button>
        <el-button
          type="text"
          v-if="node.childNodes.length == 0"
          size="mini"
          @click="() => handleRemove(node, data)"
        >
          删除
        </el-button>
      </span>
    </span>
    </el-tree>
    <el-dialog :title="title" :visible.sync="dialogVisible" width="30%">
      <el-form :model="category">
        <el-form-item label="分类名称">
          <el-input v-model="category.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="图标">
          <el-input v-model="category.icon" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="计量单位">
          <el-input
            v-model="category.productUnit"
            autocomplete="off"
          ></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitData">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      data: [],
      defaultProps: {
        children: 'children',
        label: 'name'
      },
      // 添加和修改使用
      category: {
        name: "",
        parentCid: 0,
        catLevel: 0,
        showStatus: 1,
        sort: 0,
        productUnit: "",
        icon: "",
        catId: null
      },
      //dialog开关
      dialogVisible: false,
      //dialog类型：添加/修改
      dialogType: "",
      //dialog title
      title: "",
      //树节点最大深度
      maxLevel: 1,
      //被修改排序的树节点数组
      updateNodes: [],
      //树节点的父节点id
      pCid: [],
      //树节点拖拽功能开关
      draggable: false
    };
  },
  methods: {
    //判断节点能否被拖拽
    allowDrop(draggingNode, dropNode, type) {
      //节点的最大深度
      this.maxLevel = draggingNode.level;
      this.countNodeLevel(draggingNode);
      //当前节点的深度
      let deep = Math.abs(this.maxLevel - draggingNode.level) + 1;
      if (type == "inner") {
        return deep + dropNode.level <= 3;
      } else {
        return deep + dropNode.parent.level <= 3;
      }
    },
    //计算节点最大深度
    countNodeLevel(node) {
      //找到所有的子节点，求出最大深度
      if (node.childNodes != null && node.childNodes.length > 0) {
        for (let i = 0; i < node.childNodes.length; i++) {
          if (node.childNodes[i].level > this.maxLevel) {
            this.maxLevel = node.childNodes[i].level;
          }
          this.countNodeLevel(node.childNodes[i]);
        }
      }
    },
    //拖拽事件结束后触发函数（拖拽后将影响到category的 catLevel，sort，parentId）
    handleDrop(draggingNode, dropNode, dropType, ev) {
      //draggingNode:拖拽节点，dropNode：将拖拽到节点
      //1、当前节点最新父节点的id
      let pCid = 0;
      let sibings = null;
      if (dropType == "before" || dropType == "after") {
        pCid = dropNode.parent.data.catId == undefined ? 0 : dropNode.parent.data.catId;
        sibings = dropNode.parent.childNodes;
      } else {
        pCid = dropNode.data.catId;
        sibings = dropNode.childNodes;
      }
      //2、当前拖拽节点的最新顺序
      for (let i = 0; i < sibings.length; i++) {
        //如果遍历的是当前正在拖拽的节点
        if (sibings[i].data.catId == draggingNode.data.catId) {
          let catLevel = draggingNode.level;
          if (sibings[i].level != draggingNode.level) {
            //当前节点的层级发生变化
            catLevel = sibings[i].level;
            //修改他子节点的层级
            this.updateChildNodeLevel(sibings[i]);
          }
          this.updateNodes.push({
            catId: sibings[i].data.catId,
            sort: i,
            parentCid: pCid,
            catLevel: catLevel,
          });
        } else {
          this.updateNodes.push({catId: sibings[i].data.catId, sort: i});
        }
      }
      this.pCid.push(pCid);
      //拖拽之后重新置1
      this.maxLevel = 1;
    },
    //修改子节点深度
    updateChildNodeLevel(node) {
      if (node.childNodes.length > 0) {
        for (let i = 0; i < node.childNodes.length; i++) {
          //遍历子节点，传入（catId，catLevel）
          let cNode = node.childNodes[i].data;
          this.updateNodes.push({catId: cNode.catId, catLevel: node.childNodes[i].level});
          //处理子节点的子节点
          this.updateChildNodeLevel(node.childNodes[i]);
        }
      }
    },
    //获取后台数据
    getMenus() {
      this.$http({
        url: this.$http.adornUrl('/product/category/list/tree'),
        method: 'get'
      }).then(data => {
        this.data = data.data.data;
      })
    },
    //删除数据
    handleRemove(node, data) {
      let ids = [data.catId];
      this.$confirm(`是否删除【${data.name}】菜单？`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      })
        .then(() => {
          this.$http({
            url: this.$http.adornUrl("/product/category/delete"),
            method: "post",
            data: this.$http.adornData(ids, false),
          }).then(({data}) => {
            this.$message({
              message: "菜单删除成功",
              type: "success",
            });
            //刷新出新的菜单
            this.getMenus();
            //设置需要默认展开的菜单
            this.expandedKey = [node.parent.data.catId]
          });
        })
        .catch(() => {
        });
    },
    //编辑
    handleEdit(data) {
      this.dialogType = "edit";
      this.title = "修改菜单";
      this.dialogVisible = true;
      this.$http({
        url: this.$http.adornUrl(`/product/category/info/${data.catId}`),
        method: "get",
      }).then(({data}) => {
        console.log(data);
        this.category.catId = data.category.catId;
        this.category.name = data.category.name;
        this.category.inco = data.category.inco;
        this.category.productUnit = data.category.productUnit;
      })
    },
    //添加
    handleAppend(data) {
      console.log("append" + data);
      this.dialogType = "add";
      this.title = "添加菜单";
      this.dialogVisible = true;
      this.category.parentCid = data.catId;
      this.category.catLevel = data.catLevel * 1 + 1;
      this.category.name = "";
      this.category.inco = "";
      this.category.productUnit = "";
    },
    editCategory() {
      let {catId, name, icon, productUnit} = this.category;
      this.$http({
        url: this.$http.adornUrl("/product/category/update"),
        method: "post",
        data: this.$http.adornData({catId, name, icon, productUnit}, false),
      }).then(({data}) => {
        this.$message({
          message: "修改成功",
          type: "success",
        });
        //刷新出新的菜单
        this.getMenus();
        //设置需要默认展开的菜单
        this.expandedKey = [this.category.parentCid];
        this.dialogVisible = false;
      });
    },
    addCategory() {
      this.$http({
        url: this.$http.adornUrl("/product/category/save"),
        method: "post",
        data: this.$http.adornData(this.category, false),
      }).then(({data}) => {
        this.$message({
          message: "添加成功",
          type: "success",
        });
        //刷新出新的菜单
        this.getMenus();
        //设置需要默认展开的菜单
        this.expandedKey = [this.category.parentCid];
        this.dialogVisible = false;
      });
    },
    submitData() {
      if (this.dialogType == "add") {
        this.addCategory();
      }
      if (this.dialogType == "edit") {
        this.editCategory();
      }
    },
    //提交数据
    batchSave() {
      this.$http({
        url: this.$http.adornUrl("/product/category/update/sort"),
        method: "post",
        data: this.$http.adornData(this.updateNodes, false),
      }).then(({data}) => {
        this.$message({
          message: "菜单顺序修改成功",
          type: "success",
        });
        //刷新出新的菜单
        this.getMenus();
        //设置需要默认展开的菜单
        this.expandedKey = this.pCid;
      });
      this.updateNodes = [];
    },
    batchDelete() {
      let catIds = [];
      let catNames = [];
      let checkedNodes = this.$refs.menuTree.getCheckedNodes();
      for (let i = 0; i < checkedNodes.length; i++) {
        catIds.push(checkedNodes[i].catId);
        catNames.push(checkedNodes[i].name);
      }
      this.$confirm(`是否批量删除【${catNames}】菜单？`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).then(() => {
        this.$http({
          url: this.$http.adornUrl('/product/category/delete'),
          method: 'post',
          data: this.$http.adornData(catIds, false)
        }).then(({data}) => {
          this.$message({
            message: "菜单批量删除成功",
            type: "success",
          });
          this.getMenus();
        })
      }).catch(() => {

      });

    },
  },
  created() {
    this.getMenus();
  }
}
</script>

