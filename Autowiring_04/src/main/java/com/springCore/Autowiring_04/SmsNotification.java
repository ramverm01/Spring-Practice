package com.springCore.Autowiring_04;

public class SmsNotification implements NotificationService
{

	@Override
	public void sendNotification() 
	{
		System.out.println("SMS Notification Sent Successfully....!");
	}
	
}
