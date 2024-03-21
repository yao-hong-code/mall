package com.edu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.coupon.entity.SeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 *
 * @author yao-hong
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {

}
