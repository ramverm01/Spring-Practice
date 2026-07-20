package com.nit.LambokAPISetterAndConstructorTask01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/LambokAPISetterAndConstructorTask01/application-Context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Employee bean = context.getBean("employee", Employee.class);
		System.out.println(bean);
	}

}
