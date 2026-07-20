package com.nit.COLLECTIONS_INJECTION;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/COLLECTIONS_INJECTION/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		FoodCart bean = context.getBean("food", FoodCart.class);
		System.out.println(bean);
	}

}
