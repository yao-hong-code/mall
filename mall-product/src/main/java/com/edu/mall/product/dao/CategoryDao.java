package com.edu.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author yao-hong
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
