package com.edu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author yao-hong
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

