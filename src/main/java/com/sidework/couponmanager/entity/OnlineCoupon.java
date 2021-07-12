package com.sidework.couponmanager.entity;

import java.util.Date;

public class OnlineCoupon extends Coupon {
	private String code;

	public OnlineCoupon(String issuer, Date expiryDate, Date effectiveDate) {
		super(issuer, expiryDate, effectiveDate);
	}
}
