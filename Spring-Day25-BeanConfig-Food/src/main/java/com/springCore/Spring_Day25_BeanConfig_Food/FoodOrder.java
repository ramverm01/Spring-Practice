package com.springCore.Spring_Day25_BeanConfig_Food;

public class FoodOrder {
	DeliveryService deliveryService;

	public FoodOrder(DeliveryService deliveryService) 
	{
		this.deliveryService = deliveryService;
	}

	public void placeOrder() 
	{
		System.out.println("Food Order Confirmed....!");
		deliveryService.deliver();
	}
}
