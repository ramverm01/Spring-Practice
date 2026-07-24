package com.springCore.Spring_Day26_QualifierPrimary;

import org.springframework.beans.factory.annotation.Autowired;

public class BillingService 
{
	@Autowired
	private PaymentService paymentService;
	
	public void generateBill()
	{
		System.out.println("Generating Bill...");
		paymentService.pay(2500);
		System.out.println("Bill Generated Successfully.");
	}
}
  