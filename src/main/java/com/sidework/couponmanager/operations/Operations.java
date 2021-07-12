package com.sidework.couponmanager.operations;

import java.util.List;

import com.sidework.couponmanager.entity.Coupon;

public interface Operations {

	public List<Coupon> getAllCoupons();
	
	public void addCoupon(Coupon coupon);
	
	public void updateCoupon(Coupon coupon);
	
	public void deleteCoupon(Coupon coupon);
}
