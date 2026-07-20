package com.springCore.Spring_Day22_Stereotype_Annotations_Task02;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com");
		
		// Get name of spring bean having "nott" as user define bean name
		NotificationService notificationService = context.getBean(NotificationService.class);
		notificationService.sendNotification();
		
		// Get name of spring bean having "?" as predefined define bean name
		NotificationService notificationService1 = context.getBean(NotificationService.class);
		notificationService1.sendNotification();
		
		//Print Bean Name
		String[] beanNamesForType = context.getBeanNamesForType(NotificationService.class);
		System.out.println(Arrays.toString(beanNamesForType));
		
		
		//Singleton Scope
		NotificationService bean1 = context.getBean(NotificationService.class);
		NotificationService bean2 = context.getBean(NotificationService.class);
		System.out.println(bean1.hashCode() +" = "+bean2.hashCode());
		
		//Prototype Scope
		NotificationService bean3 = context.getBean(NotificationService.class);
		NotificationService bean4 = context.getBean(NotificationService.class);
		System.out.println(bean3.hashCode() +" = "+bean4.hashCode());
	}
}
