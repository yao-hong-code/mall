package com.edu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author yao-hong
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}
