package com.edu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.order.entity.OrderReturnApplyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 *
 * @author yao-hong
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {

}
