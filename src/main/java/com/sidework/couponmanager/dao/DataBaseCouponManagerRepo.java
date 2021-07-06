package com.sidework.couponmanager.dao;

import com.sidework.couponmanager.entity.Coupon;

import java.util.List;

public class DataBaseCouponManagerRepo implements CouponManagerRepo{
    @Override
    public List<Coupon> getAllCoupons() {
        return null;
    }

    @Override
    public boolean addCoupon(Coupon coupon) {
        return false;
    }

    @Override
    public Coupon getCouponByName() {
        return null;
    }

    @Override
    public boolean updateCouponById(Coupon coupon) {
        return false;
    }

    @Override
    public boolean deleteCoupon(Coupon coupon) {
        return false;
    }
}
