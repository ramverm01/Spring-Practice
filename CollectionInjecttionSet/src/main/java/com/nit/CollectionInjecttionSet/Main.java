package com.nit.CollectionInjecttionSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		String str = "com/nit/CollectionInjecttionSet/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		StudentEnrollment studentEnrollment = context.getBean("student",StudentEnrollment.class);
		System.out.println(studentEnrollment);
	}

}
