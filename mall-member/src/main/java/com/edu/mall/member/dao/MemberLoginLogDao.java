package com.edu.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.member.entity.MemberLoginLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author yao-hong
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {

}
