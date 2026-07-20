package com.nit.SetterInjectHAS_A_Relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/SetterInjectHAS_A_Relation/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		ToyCar bean = context.getBean("toycar", ToyCar.class);
		System.out.println(bean);
	}

}
