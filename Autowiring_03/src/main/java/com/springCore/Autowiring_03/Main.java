package com.springCore.Autowiring_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/springCore/Autowiring_03/appliaction-conext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Library library = context.getBean("library", Library.class);
		library.issueBook();
	}

}
