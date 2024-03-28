package com.edu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yao-hong
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取树形结构数据
     *
     * @return: java.util.List<com.edu.mall.product.entity.CategoryEntity>
     * @author yao-hong
     */
    List<CategoryEntity> listWithTree();

    /**
     * 根据id批量删除分类
     *
     * @param asList
     * @return: void
     * @author yao-hong
     */
    void removeMenuByIds(List<Long> asList);

    /**
     * 根据id查询完整路径
     *
     * @param catelogId
     * @return: java.lang.Long[]
     * @author yao-hong
     */
    Long[] findCatelogPath(Long catelogId);
}

