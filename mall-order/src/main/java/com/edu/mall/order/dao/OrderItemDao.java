package com.edu.mall.order.dao;

import com.edu.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yao-hong
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
