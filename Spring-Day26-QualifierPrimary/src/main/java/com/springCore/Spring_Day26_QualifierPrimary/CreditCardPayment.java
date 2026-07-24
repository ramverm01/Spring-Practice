package com.springCore.Spring_Day26_QualifierPrimary;

public class CreditCardPayment implements PaymentService
{

	@Override
	public void pay(double amount)
	{
		System.out.println("Payment completed using Credit Card.");
		System.out.println("Amount :- "+amount);
	}

}
