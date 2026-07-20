package com.springCore.Autowiring_04;

public class EmailNotification implements NotificationService
{

	@Override
	public void sendNotification() 
	{
		System.out.println("Email Notification Sent Successfully....!");
	}

}
