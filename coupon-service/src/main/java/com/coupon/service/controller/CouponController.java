package com.coupon.service.controller;

import com.coupon.service.model.Coupon;
import com.coupon.service.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon/api")
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCouponByCode(@PathVariable("code") String code) {
        return couponRepository.findByCode(code);
    }

}
