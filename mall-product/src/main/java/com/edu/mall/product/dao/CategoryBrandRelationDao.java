package com.edu.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 *
 * @author yao-hong
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

}
