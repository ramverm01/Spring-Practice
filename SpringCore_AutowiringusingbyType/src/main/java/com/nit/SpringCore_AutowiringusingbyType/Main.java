package com.nit.SpringCore_AutowiringusingbyType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/SpringCore_AutowiringusingbyType/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Patient bean = context.getBean("patient", Patient.class);
		System.out.println(bean);
	}

}
