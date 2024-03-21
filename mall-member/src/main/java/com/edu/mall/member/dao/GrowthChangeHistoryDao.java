package com.edu.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author yao-hong
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}
