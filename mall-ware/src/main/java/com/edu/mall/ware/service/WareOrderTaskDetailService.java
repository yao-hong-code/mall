package com.edu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * ???湤?
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:13:00
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

