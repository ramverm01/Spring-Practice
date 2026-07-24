package com.springCore.Spring_Day26_DependsOnScope;

import org.springframework.context.annotation.DependsOn;

@DependsOn("databaseConnection")
public class PaymentGateway 
{
	private String gatewayName;
	
	
	
	public PaymentGateway(String gatewayName) {
		super();
		this.gatewayName = gatewayName;
	}



	public void startGateway()
	{
		System.out.println(gatewayName+" Payment Gateway Started... ");
	}
}
