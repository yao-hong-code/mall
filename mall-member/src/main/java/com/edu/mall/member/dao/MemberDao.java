package com.edu.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author yao-hong
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
