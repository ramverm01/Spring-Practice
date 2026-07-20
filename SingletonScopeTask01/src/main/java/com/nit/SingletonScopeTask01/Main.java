package com.nit.SingletonScopeTask01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/SingletonScopeTask01/application-Context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		ConfigurationManager configurationManager1 = context.getBean("configuration", ConfigurationManager.class);
		ConfigurationManager configurationManager2 = context.getBean("configuration", ConfigurationManager.class);
		System.out.println(configurationManager1);
		System.out.println(configurationManager1.hashCode());
		System.out.println(configurationManager2.hashCode());
		
	}

}
