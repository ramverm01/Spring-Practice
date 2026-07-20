package com.springCore.Autowiting_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		String str = "com/springCore/Autowiting_01/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		ShoppingCart shoppingCart = context.getBean("shopping",ShoppingCart.class);
		shoppingCart.checkout();;
	}

}
