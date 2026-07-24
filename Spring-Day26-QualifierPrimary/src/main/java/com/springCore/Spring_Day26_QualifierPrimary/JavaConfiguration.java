package com.springCore.Spring_Day26_QualifierPrimary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfiguration 
{
	@Bean
	@Primary
	public PaymentService creditCardPayment()
	{
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		return creditCardPayment;
	}
	
	@Bean
//	@Primary
	public PaymentService upiPayment()
	{
		UpiPayment upiPayment = new UpiPayment();
		return upiPayment;
	}
	
	@Bean
	public OrderService orderService()
	{
		OrderService orderService = new OrderService();
		return orderService;
	}
	
	@Bean
	public BillingService billingService()
	{
		BillingService billingService = new BillingService();
		return billingService;
	}
}
