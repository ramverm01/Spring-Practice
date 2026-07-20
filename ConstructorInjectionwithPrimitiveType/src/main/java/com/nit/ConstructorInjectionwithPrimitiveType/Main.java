package com.nit.ConstructorInjectionwithPrimitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		String str = "com/nit/ConstructorInjectionwithPrimitiveType/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Teacher bean = context.getBean("teacher",Teacher.class);
		System.out.println(bean);
	}

}
