package com.springCore.Spring_Day22_Stereotype_Annotations_Task02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NotificationService 
{
	public void sendNotification()
	{
		System.out.println("Notification sent successfully....");
	}
}
