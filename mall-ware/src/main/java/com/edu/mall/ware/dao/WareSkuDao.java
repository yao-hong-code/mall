package com.edu.mall.ware.dao;

import com.edu.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yao-hong
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
