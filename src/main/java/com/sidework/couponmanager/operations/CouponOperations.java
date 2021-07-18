package com.sidework.couponmanager.operations;

import java.util.ArrayList;
import java.util.List;

import com.sidework.couponmanager.dao.CouponManagerRepo;
import com.sidework.couponmanager.entity.Coupon;

public class CouponOperations implements Operations {

	private final List<Coupon> coupons = new ArrayList<Coupon>();
	private CouponManagerRepo repository;

	public CouponOperations(CouponManagerRepo repo){
		this.repository = repo;
	}
	
	@Override
	public List<Coupon> getAllCoupons() {
		return repository.getAllCoupons();

	}
	
	@Override
	public void addCoupon(Coupon coupon) {
		repository.addCoupon(coupon);
		
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
