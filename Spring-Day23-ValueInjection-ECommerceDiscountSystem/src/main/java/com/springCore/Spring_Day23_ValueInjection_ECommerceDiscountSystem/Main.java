package com.springCore.Spring_Day23_ValueInjection_ECommerceDiscountSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springCore.Spring_Day23_ValueInjection_ECommerceDiscountSystem");
		Product product = context.getBean("Product", Product.class);
		System.out.println(product);
		System.out.println("The Discounted Price :- "+product.getFinalPrice());
	}

}
