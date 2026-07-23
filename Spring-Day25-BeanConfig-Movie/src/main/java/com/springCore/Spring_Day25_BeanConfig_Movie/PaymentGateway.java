package com.springCore.Spring_Day25_BeanConfig_Movie;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway 
{
	public void makePayment()
	{
		System.out.println("Payment Completed.....!");
	}
}
