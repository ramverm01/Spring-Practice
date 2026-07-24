package com.springCore.Spring_Day26_DependsOnScope;

public class OrderService
{
	private int orderId;
	private RestaurantService restaurantService;
	private Customer customer;
	
	

	public OrderService(int orderId, RestaurantService restaurantService, Customer customer) {
		super();
		this.orderId = orderId;
		this.restaurantService = restaurantService;
		this.customer = customer;
	}



	public void placeOrder()
	{
		restaurantService.initializeRestaurant();
		customer.showCustomer();
		System.out.println(orderId+" Order Placed Successfully...");
	}
}
