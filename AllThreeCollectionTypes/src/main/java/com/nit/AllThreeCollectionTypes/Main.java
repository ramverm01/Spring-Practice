package com.nit.AllThreeCollectionTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/nit/AllThreeCollectionTypes/AppConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Library library = context.getBean("library", Library.class);
		System.out.println(library);
	}

}
