package com.springCore.Spring_Day26_QualifierPrimary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		OrderService bean = context.getBean("orderService", OrderService.class);
		bean.placeOrder();
		BillingService bean2 = context.getBean("billingService", BillingService.class);
		bean2.generateBill();
	}

}
