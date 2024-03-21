package com.edu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author yao-hong
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {

}
