package com.edu.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.member.entity.IntegrationChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 *
 * @author yao-hong
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {

}
