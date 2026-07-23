package com.springCore.Spring_Day25_BeanConfig_Food;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService 
{
	public void deliver()
	{
		System.out.println("Food Delivered Successfully....!");
	}
}
