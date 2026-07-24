package com.springCore.Spring_Day26_DependsOnScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		OrderService orderService = context.getBean("orderService", OrderService.class);
		orderService.placeOrder();
		
		Customer customer1 = context.getBean("customer", Customer.class);
		customer1.showCustomer();
		
		Customer customer2 = context.getBean("customer", Customer.class);
		customer2.showCustomer();
		
		System.out.println("Customer Object 1 :\n"+customer1);
		System.out.println("Customer Object 2 :\n"+customer2);
	}

}
