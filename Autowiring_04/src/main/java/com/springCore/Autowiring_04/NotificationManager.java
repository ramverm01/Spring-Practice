package com.springCore.Autowiring_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationManager 
{
	@Autowired
	@Qualifier("sms")
	private NotificationService notificationService;
	
	public void notifyUser() 
	{
		System.out.println("Notification Manager Started");
		notificationService.sendNotification();
	}
}
