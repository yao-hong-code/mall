package com.edu.mall.order.dao;

import com.edu.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yao-hong
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
