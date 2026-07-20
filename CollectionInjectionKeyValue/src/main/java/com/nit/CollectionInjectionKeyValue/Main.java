package com.nit.CollectionInjectionKeyValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/CollectionInjectionKeyValue/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		RechargePlan bean = context.getBean("recharge", RechargePlan.class);
		System.out.println(bean);
	}

}
