package com.springCore.Spring_Day26_DependsOnScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class JavaConfiguration 
{
	@Bean
	public DatabaseConnection databaseConnection()
	{
		DatabaseConnection databaseConnection = new DatabaseConnection("MySql");
		databaseConnection.connectDatabase();
		return databaseConnection;
	}
	
	@Bean
	@DependsOn("databaseConnection")
	public PaymentGateway paymentGateway()
	{
		PaymentGateway paymentGateway = new PaymentGateway("Paytm");
		paymentGateway.startGateway();
		return paymentGateway;  
	}
	
	@Bean
	@DependsOn("paymentGateway")
	public RestaurantService restaurantService()
	{
		return new RestaurantService("Chandan Sir Restorent");
	}
	
	@Bean
	public Customer customer()
	{
		return new Customer(101, "Ram");
	}
	
	@Bean
	public OrderService orderService()
	{
		return new OrderService(100,restaurantService(),customer());
	}
}
