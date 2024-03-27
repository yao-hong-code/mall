package com.edu.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.common.utils.PageUtils;
import com.edu.common.utils.Query;
import com.edu.mall.product.dao.BrandDao;
import com.edu.mall.product.entity.BrandEntity;
import com.edu.mall.product.service.BrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>().lambda().like(StringUtils.isNotEmpty((String) params.get("key")), BrandEntity::getName, params.get("key"))
        );

        return new PageUtils(page);
    }

}