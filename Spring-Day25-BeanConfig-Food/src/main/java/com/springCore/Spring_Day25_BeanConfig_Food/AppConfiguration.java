package com.springCore.Spring_Day25_BeanConfig_Food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration 
{
	@Bean
	public DeliveryService deliveryService()
	{
		return new DeliveryService();
	}
	
	@Bean
	public FoodOrder foodOrder()
	{
		return new FoodOrder(deliveryService());
	}
}
