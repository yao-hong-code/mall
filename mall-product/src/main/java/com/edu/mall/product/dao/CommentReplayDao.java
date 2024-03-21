package com.edu.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author yao-hong
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
