package com.edu.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.common.utils.PageUtils;
import com.edu.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author yao-hong
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

