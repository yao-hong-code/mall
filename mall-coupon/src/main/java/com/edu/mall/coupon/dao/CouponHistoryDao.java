package com.edu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.coupon.entity.CouponHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author yao-hong
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {

}
