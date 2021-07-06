package com.sidework.couponmanager.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sidework.couponmanager.CouponManager;
import com.sidework.couponmanager.CouponOperations;
import com.sidework.couponmanager.entity.Coupon;


@RestController
public class CouponManagerRestController {

	@GetMapping("/coupon/api/all")
	public List<Coupon> getAllCoupons() {
		CouponManager dao = new CouponOperations();
		return dao.getAllCoupons();
		
	}
	
	@PostMapping("/coupon/api/add")
	public void addCoupon(@RequestBody Map<String,String> request) {
	}
		
}
