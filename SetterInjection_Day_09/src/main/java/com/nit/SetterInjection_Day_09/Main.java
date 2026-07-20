package com.nit.SetterInjection_Day_09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/SetterInjection_Day_09/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Employee bean = context.getBean("emp",Employee.class);
		System.out.println(bean);
	}

}
