package com.nit.SpringCore_AutowiringusingbyName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str="com/nit/SpringCore_AutowiringusingbyName/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Order bean = context.getBean("order",Order.class);
		System.out.println(bean);
	}

}
