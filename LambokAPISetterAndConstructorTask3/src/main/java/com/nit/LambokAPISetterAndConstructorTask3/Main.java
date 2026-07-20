package com.nit.LambokAPISetterAndConstructorTask3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/LambokAPISetterAndConstructorTask3/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
