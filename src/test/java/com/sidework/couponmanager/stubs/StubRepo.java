package com.sidework.couponmanager.stubs;

import com.sidework.couponmanager.dao.CouponManagerRepo;
import com.sidework.couponmanager.entity.Coupon;

import java.util.ArrayList;
import java.util.List;

public class StubRepo implements CouponManagerRepo {
    private final List<Coupon> coupons = new ArrayList<Coupon>();
    @Override
    public List<Coupon> getAllCoupons() {
       return this.coupons;
    }

    @Override
    public boolean addCoupon(Coupon coupon) {
        coupons.add(coupon);
        return true;
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
