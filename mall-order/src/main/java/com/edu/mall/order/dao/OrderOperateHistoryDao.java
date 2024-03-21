package com.edu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.order.entity.OrderOperateHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 *
 * @author yao-hong
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {

}
