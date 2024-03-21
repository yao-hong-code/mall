<template>
  <el-tree :data="menus" :props="defaultProps" node-key="catId" ref="menuTree">
  </el-tree>
</template>
<script>
export default {
  data() {
    return {
      menus: [],
      defaultProps: {
        children: "children",
        label: "name"
      },
      expandedKey: [],
    }
  },
  methods: {
    getMenus() {
      this.$http(
        {
          url: this.$http.adornUrl("/product/category/list/tree"),
          method: "get",
        }
      ).then(({data}) => {
          this.menus = data.data;
        }
      )
    }
  },
  created() {
    this.getMenus();
  }
}

</script>
