package com.springCore.Spring_Day26_DependsOnScope;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Customer 
{
	private int customerId;
	private String customerName;
	
	
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}



	public void showCustomer()
	{
		System.out.println("====Customer Created====");
		System.out.println("Customer Id : "+customerId);
		System.out.println("Customer Name : "+customerName);
	}
	
}
