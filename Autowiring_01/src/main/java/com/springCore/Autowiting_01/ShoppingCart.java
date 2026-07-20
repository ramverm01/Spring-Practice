package com.springCore.Autowiting_01;

import org.springframework.beans.factory.annotation.Autowired;

public class ShoppingCart 
{
	private PaymentService paymentService;
	
	public ShoppingCart()
	{
		super();
	}

	public PaymentService getPaymentService() 
	{
		return paymentService;
	}

	@Autowired
	public void setPaymentService(PaymentService paymentService) 
	{
		this.paymentService = paymentService;
	}

	public void checkout()
	{
		System.out.println("Shopping Cart CheckOut");
		paymentService.pay();
	}
	
	
}
