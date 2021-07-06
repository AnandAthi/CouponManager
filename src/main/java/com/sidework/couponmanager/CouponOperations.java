package com.sidework.couponmanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sidework.couponmanager.entity.Coupon;
import com.sidework.couponmanager.entity.StoreCoupon;

public class CouponOperations implements CouponManager {

	private final List<Coupon> coupons = new ArrayList<Coupon>(); 
	
	public CouponOperations(){
		
	}
	
	@Override
	public List<Coupon> getAllCoupons() {

		return coupons;
	}
	
	@Override
	public void addCoupon(Coupon coupon) {
		coupons.add(coupon);
		
	}

	@Override
	public void updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		
	}

}
