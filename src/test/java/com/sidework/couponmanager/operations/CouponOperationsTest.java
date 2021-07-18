package com.sidework.couponmanager.operations;

import static org.junit.jupiter.api.Assertions.*;

import com.sidework.couponmanager.dao.CouponManagerRepo;
import com.sidework.couponmanager.stubs.StubRepo;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;

import com.sidework.couponmanager.entity.Coupon;
import com.sidework.couponmanager.entity.StoreCoupon;

/**
 * @author kiamz
 *
 */
public class CouponOperationsTest {
	CouponManagerRepo stubRepo = new StubRepo();

	@Test
	public void addOneCouponSizeEqualsOne() {
		CouponOperations couponManager = new CouponOperations(stubRepo);
		Coupon co = new StoreCoupon("Aldi", DateUtil.now(), DateUtil.tomorrow());
		couponManager.addCoupon(co);
		assertEquals(1, couponManager.getAllCoupons().size());
	}

}
