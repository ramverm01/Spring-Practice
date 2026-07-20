package com.springCore.Autowiring_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/springCore/Autowiring_04/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		NotificationManager notificationManager = context.getBean("manager", NotificationManager.class);
		notificationManager.notifyUser();
	}

}
