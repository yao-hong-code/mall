<template>
  <el-dialog
    :title="!dataForm.attrGroupId ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible"
    @closed="dialogClose"
  >
    <el-form
      :model="dataForm"
      :rules="dataRule"
      ref="dataForm"
      @keyup.enter.native="dataFormSubmit()"
      label-width="80pxs"
    >
      <el-form-item label="属性组名" prop="attrGroupName">
        <el-input v-model="dataForm.attrGroupName" placeholder="属性组名"></el-input>
      </el-form-item>
      <el-form-item label="排序" prop="sort">
        <el-input v-model="dataForm.sort" placeholder="排序"></el-input>
      </el-form-item>
      <el-form-item label="描述" prop="descript">
        <el-input v-model="dataForm.descript" placeholder="描述"></el-input>
      </el-form-item>
      <el-form-item label="组图标" prop="icon">
        <single-upload v-model="dataForm.icon"></single-upload>
      </el-form-item>
      <el-form-item label="所属分类" prop="catelogPath">
        <el-cascader
          v-model="dataForm.catelogPath"
          :options="categroys"
          :props="props"
          placeholder="试试搜索：手机"
          filterable>
        </el-cascader>
      </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
import singleUpload from "../../../components/upload/singleUpload";

export default {
  components: {
    singleUpload
  },
  data() {
    return {
      //dialog 开关
      visible: false,
      //表单数据
      dataForm: {
        attrGroupId: 0,
        attrGroupName: "",
        sort: "",
        descript: "",
        icon: "",
        catelogId: 0, //保存要提交的子节点的id
        //所属分类完整路径
        catelogPath: [],
      },
      props: {
        value: "catId",
        label: "name",
        children: "children"
      },
      //子组件数据
      categroys: [],
      //校验规则
      dataRule: {
        attrGroupName: [
          {required: true, message: '属性组名不能为空', trigger: 'blur'}
        ],
        sort: [
          {required: true, message: '排序不能为空', trigger: 'blur'}
        ],
        descript: [
          {required: true, message: '描述不能为空', trigger: 'blur'}
        ],
        icon: [
          {required: true, message: '不能图标为空', trigger: 'blur'}
        ],
        catelogPath: [
          {required: true, message: '所属分类不能为空', trigger: 'blur'}
        ]
      }
    }
  },
  created() {
    this.getCategories();
  },
  methods: {
    init(id) {
      this.dataForm.attrGroupId = id || 0
      this.visible = true
      this.$nextTick(() => {
        this.$refs['dataForm'].resetFields()
        if (this.dataForm.attrGroupId) {
          this.$http({
            url: this.$http.adornUrl(`/product/attrgroup/info/${this.dataForm.attrGroupId}`),
            method: 'get',
            params: this.$http.adornParams()
          }).then(({data}) => {
            if (data && data.code === 0) {
              this.dataForm.attrGroupName = data.attrGroup.attrGroupName
              this.dataForm.sort = data.attrGroup.sort
              this.dataForm.descript = data.attrGroup.descript
              this.dataForm.icon = data.attrGroup.icon
              this.dataForm.catelogId = data.attrGroup.catelogId
              this.dataForm.catelogPath = data.attrGroup.catelogPath;
            }
          })
        }
      })
    },
    dialogClose() {
      this.catelogPath = [];
    },
    // 表单提交
    dataFormSubmit() {
      this.$refs['dataForm'].validate((valid) => {
        if (valid) {
          this.$http({
            url: this.$http.adornUrl(`/product/attrgroup/${!this.dataForm.attrGroupId ? 'save' : 'update'}`),
            method: 'post',
            data: this.$http.adornData({
              'attrGroupId': this.dataForm.attrGroupId || undefined,
              'attrGroupName': this.dataForm.attrGroupName,
              'sort': this.dataForm.sort,
              'descript': this.dataForm.descript,
              'icon': this.dataForm.icon,
              'catelogId': this.dataForm.catelogPath[this.dataForm.catelogPath.length - 1],
            })
          }).then(({data}) => {
            if (data && data.code === 0) {
              this.$message({
                message: '操作成功',
                type: 'success',
                duration: 1500,
                onClose: () => {
                  this.visible = false
                  this.$emit('refreshDataList')
                }
              })
            } else {
              this.$message.error(data.msg)
            }
          })
        }
      })
    },
    getCategories() {
      this.$http({
        url: this.$http.adornUrl("/product/category/list/tree"),
        method: "get",
      }).then(({data}) => {
        this.categroys = data.data;
      });
    },
  }
}
</script>
