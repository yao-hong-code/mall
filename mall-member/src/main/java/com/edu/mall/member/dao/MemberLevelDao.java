package com.edu.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.member.entity.MemberLevelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 *
 * @author yao-hong
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

}
