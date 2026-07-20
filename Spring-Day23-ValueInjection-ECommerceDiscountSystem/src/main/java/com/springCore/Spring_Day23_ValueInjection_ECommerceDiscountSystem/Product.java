package com.springCore.Spring_Day23_ValueInjection_ECommerceDiscountSystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Product")
@Scope("prototype")
@PropertySource("classpath:com/springCore/Spring_Day23_ValueInjection_ECommerceDiscountSystem/application.properties")
public class Product 
{
	@Value("${Product_name}")
	private String productName;
	@Value("${Product_id}")
	private int productId;
	@Value("${Product_price}")
	private double productPrice;
	@Value("${customerIsPremium}")
	private boolean customerIsPremium;
	
	public Product()
	{
		super();
	}
	
	public double getFinalPrice()
	{
		if(customerIsPremium)
		{
			productPrice = (productPrice*20)/100;
		}
		return productPrice;
	}

	@Override
	public String toString() 
	{
		return "Product [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", customerIsPremium=" + customerIsPremium + "]";
	}
}
