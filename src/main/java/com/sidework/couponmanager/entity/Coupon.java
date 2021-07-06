/**
 * 
 */
package com.sidework.couponmanager.entity;

import java.util.Date;

/**
 * @author kiamz
 *
 */
public abstract class Coupon {

	private  Long id;
	private String issuer;
	private Date expiryDate;
	private Date effectiveDate;
	private CouponValue value;
	private CouponTerms terms;
	
	Coupon(){
		
	}
	
	Coupon(String provider,Date effDate,Date expDate){
		this.id = 1l;
		this.issuer = provider;
		this.effectiveDate = effDate;
		this.expiryDate = expDate;
	}

	public CouponTerms getTerms() {
		return terms;
	}

	public void setTerms(CouponTerms terms) {
		this.terms = terms;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public CouponValue getValue() {
		return value;
	}

	public void setValue(CouponValue value) {
		this.value = value;
	}

}
