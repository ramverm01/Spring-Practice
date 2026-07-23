package com.springCore.Spring_Day25_BeanConfig_Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MovieTicket movieTicket = context.getBean("movieTicket", MovieTicket.class);
		movieTicket.bookTicket();
	}

}
