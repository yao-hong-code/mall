package com.edu.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.common.utils.PageUtils;
import com.edu.common.utils.Query;
import com.edu.mall.product.dao.CategoryDao;
import com.edu.mall.product.entity.CategoryEntity;
import com.edu.mall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    /**
     * 获取树形结构数据
     *
     * @return: java.util.List<com.edu.mall.product.entity.CategoryEntity>
     * @author yao-hong
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 获取所有分类数据
        List<CategoryEntity> allCategoryEntities = baseMapper.selectList(null);

        List<CategoryEntity> treeData = allCategoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildren(menu, allCategoryEntities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return treeData;
    }

    /**
     * 根据id批量删除分类
     *
     * @param asList
     * @return: void
     * @author yao-hong
     */
    @Override
    public void removeMenuByIds(List<Long> asList) {
        //todo 检查当前删除的菜单，是否被别的地方引用
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        return children;
    }

}