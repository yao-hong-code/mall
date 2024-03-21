package com.edu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.order.entity.RefundInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 *
 * @author yao-hong
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {

}
