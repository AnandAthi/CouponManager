package com.sidework.couponmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sidework.couponmanager.entity.Coupon;
import com.sidework.couponmanager.entity.helper.LoginCredentials;

@Controller
public class CouponManagerController {
	
	@GetMapping("/coupon")
	public String displayHomePage(Model model) {
		model.addAttribute("loginCredentials", new LoginCredentials());
		return "HomePage";
	}
	
	@PostMapping("/coupon/login")
	public String doLogin(@ModelAttribute LoginCredentials cred) {
		System.out.println("Input Email " + cred.getInputEmail());
		System.out.println("Input Pwd "+ cred.getInputPassword());
		return "redirect:/AddCoupon";
	}
	
	@PostMapping("/coupon/add")
	public void addCoupon(@RequestParam Coupon coupon, Model modelMap) {
		
	}
	
	@GetMapping("/coupon/add")
	public String displayAddCouponPage() {
		return "AddCoupon";
	}

}
