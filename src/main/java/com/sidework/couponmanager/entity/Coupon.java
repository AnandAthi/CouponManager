/**
 * 
 */
package com.sidework.couponmanager.entity;

import com.sidework.couponmanager.operations.CouponOperations;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * @author kiamz
 *
 */
@Data
public abstract class Coupon {

	private final String issuer;
	private final Date expiryDate;
	private final Date effectiveDate;

	private Long id;
	private CouponValue value;
	private CouponTerms terms;
	private CouponOperations couponOperations;

	Coupon(String issuer, Date expiryDate, Date effectiveDate){
		this.issuer = issuer;
		this.expiryDate = expiryDate;
		this.effectiveDate = effectiveDate;
	}

	public void addValue(CouponValue val){
		this.value = val;
	}

	public void addTerms(CouponTerms trm){
		this.terms = trm;
	}

	public void applyOperator(CouponOperations ops){
		this.couponOperations = ops;
	}
}
