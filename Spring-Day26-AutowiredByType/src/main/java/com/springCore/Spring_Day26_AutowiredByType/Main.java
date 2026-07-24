package com.springCore.Spring_Day26_AutowiredByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		LibraryService libraryService = context.getBean("libraryService", LibraryService.class);
		libraryService.issueBook();
				
    }

}
