package com.edu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.order.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author yao-hong
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
