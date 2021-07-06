package com.sidework.couponmanager;

import java.util.List;

import com.sidework.couponmanager.entity.Coupon;

public interface CouponManager {

	public List<Coupon> getAllCoupons();
	
	public void addCoupon(Coupon coupon);
	
	public void updateCoupon(Coupon coupon);
	
	public void deleteCoupon(Coupon coupon);
}
