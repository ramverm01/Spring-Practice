package com.springCore.Spring_Day25_BeanConfig_Food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FoodOrder foodOrder = context.getBean("foodOrder", FoodOrder.class);
		foodOrder.placeOrder();
	}

}
