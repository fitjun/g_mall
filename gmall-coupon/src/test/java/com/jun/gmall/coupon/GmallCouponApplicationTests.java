package com.jun.gmall.coupon;

import com.jun.gmall.coupon.entity.CouponEntity;
import com.jun.gmall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class GmallCouponApplicationTests {
    @Autowired
    private CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity entity = new CouponEntity();
        entity.setCouponName("手机优惠券");
        entity.setAmount(BigDecimal.valueOf(200));
        couponService.save(entity);
        System.out.println("保存成功");
    }

}
