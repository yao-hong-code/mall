package com.edu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yao-hong
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

