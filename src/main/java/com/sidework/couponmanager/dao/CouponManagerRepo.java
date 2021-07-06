package com.sidework.couponmanager.dao;

import com.sidework.couponmanager.entity.Coupon;

import java.util.List;

public interface CouponManagerRepo {

    public List<Coupon> getAllCoupons();
    public boolean addCoupon(Coupon coupon);
    public Coupon getCouponByName();
    public boolean updateCouponById(Coupon coupon);
    public boolean deleteCoupon(Coupon coupon);

}
