/**
 * 
 */
package com.sidework.couponmanager;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;

import com.sidework.couponmanager.entity.Coupon;
import com.sidework.couponmanager.entity.StoreCoupon;

/**
 * @author kiamz
 *
 */
class CouponOperationsTest {

	@Test
	public void addOneCouponSizeEqualsOne() {
		CouponOperations couponManager = new CouponOperations();
		Coupon co = new StoreCoupon("Aldi", DateUtil.now(), DateUtil.tomorrow());
		couponManager.addCoupon(co);
		assertEquals(1, couponManager.getAllCoupons().size());
	}

}
