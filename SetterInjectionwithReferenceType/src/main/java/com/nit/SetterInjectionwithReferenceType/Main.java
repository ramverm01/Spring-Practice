package com.nit.SetterInjectionwithReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) {
		String str = "com/nit/SetterInjectionwithReferenceType/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Employee bean1 = context.getBean("employee1",Employee.class);
		Employee bean2 = context.getBean("employee2",Employee.class);
		System.out.println(bean1);
		System.out.println(bean2);
	}

}
