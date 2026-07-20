package com.nit.COLLECTIONS_INJECTION;

import java.util.List;

public class FoodCart 
{
	public List<String> food;
	
	public FoodCart() 
	{
		super();
	}

	public List<String> getFood()
	{
		return food;
	}

	public void setFood(List<String> food)
	{
		this.food = food;
	}

	@Override
	public String toString()
	{
		return "FoodCart [food=" + food + "]";
	}
	
		
}
