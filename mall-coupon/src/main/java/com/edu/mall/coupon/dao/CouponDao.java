package com.edu.mall.coupon.dao;

import com.edu.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yao-hong
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
