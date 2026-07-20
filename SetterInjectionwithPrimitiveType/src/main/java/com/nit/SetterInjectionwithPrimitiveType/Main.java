package com.nit.SetterInjectionwithPrimitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/SetterInjectionwithPrimitiveType/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Library bean1 = context.getBean("library1", Library.class);
		Library bean2 = context.getBean("library2", Library.class);
		Library bean3 = context.getBean("library3", Library.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}

}
