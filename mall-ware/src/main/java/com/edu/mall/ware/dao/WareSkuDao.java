package com.edu.mall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author yao-hong
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

}
