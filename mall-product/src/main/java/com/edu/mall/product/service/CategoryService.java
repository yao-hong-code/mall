package com.edu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:39
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    /**
     * 根据id删除菜单
     *
     * @param catIds
     * @return: void
     * @author yao-hong
     */
    void removeMenuByIds(List<Long> catIds);
}

