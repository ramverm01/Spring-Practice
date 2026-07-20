package com.nit.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/SetterInjection/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Student bean = context.getBean("std", Student.class);
		System.out.println(bean);
	}

}
