package com.edu.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:04:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

