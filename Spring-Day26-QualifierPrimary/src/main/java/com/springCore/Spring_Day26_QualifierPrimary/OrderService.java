package com.springCore.Spring_Day26_QualifierPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderService 
{
	@Autowired
	@Qualifier("upiPayment")
	private PaymentService paymentService;
	
	public void placeOrder()
	{
		System.out.println("Order Created Successfully.");
		System.out.println("Processing Payment...");
		System.out.println("========================================================");
		paymentService.pay(5000);
		System.out.println("Order Placed Successfully.");
	}
}
