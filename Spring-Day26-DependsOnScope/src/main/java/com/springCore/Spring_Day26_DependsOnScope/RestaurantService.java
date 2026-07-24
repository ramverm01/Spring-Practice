package com.springCore.Spring_Day26_DependsOnScope;

import org.springframework.context.annotation.DependsOn;

@DependsOn("paymentGateway")
public class RestaurantService 
{
	private String restaurantName;
	
	
	
	public RestaurantService(String restaurantName) {
		super();
		this.restaurantName = restaurantName;
	}



	public void initializeRestaurant()
	{
		System.out.println(restaurantName+" Restaurant Service Initialized... ");
	}
}
