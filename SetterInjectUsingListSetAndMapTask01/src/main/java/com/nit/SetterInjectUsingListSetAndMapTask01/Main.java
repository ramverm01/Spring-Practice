package com.nit.SetterInjectUsingListSetAndMapTask01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		String str = "com/nit/SetterInjectUsingListSetAndMapTask01/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		University bean = context.getBean("university", University.class);
		System.out.println(bean);
	}

}
