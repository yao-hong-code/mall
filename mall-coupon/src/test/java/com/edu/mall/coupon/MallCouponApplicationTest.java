package com.edu.mall.coupon;

import com.edu.mall.coupon.entity.CouponEntity;
import com.edu.mall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test
 *
 * @author yaoh
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallCouponApplicationTest {

    @Autowired
    private CouponService couponService;

    @Test
    public void add() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("国庆节优惠卷");

        couponService.save(couponEntity);
    }
}
