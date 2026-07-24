package com.springCore.Spring_Day26_QualifierPrimary;

public class UpiPayment implements PaymentService
{

	@Override
	public void pay(double amount) 
	{
		System.out.println("Payment completed using UPI.");
		System.out.println("Amount : "+amount);
	}

}
