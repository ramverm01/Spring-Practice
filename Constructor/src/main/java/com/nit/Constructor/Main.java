package com.nit.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String s = "com/nit/Constructor/AppConfiguration.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(s);
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
		
	}

}
