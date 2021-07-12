package com.sidework.couponmanager.entity;

import java.util.Date;

public class ManufacturerCoupon extends Coupon {

    public ManufacturerCoupon(String issuer, Date expiryDate, Date effectiveDate) {
        super(issuer, expiryDate, effectiveDate);
    }
}
