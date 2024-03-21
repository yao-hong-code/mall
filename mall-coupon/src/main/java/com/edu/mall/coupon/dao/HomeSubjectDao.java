package com.edu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.mall.coupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yao-hong
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {

}
