package com.nit.FactoryDesignPattern;

public class WordMessageConverter implements Logic
{
	@Override
	public String convertTo(String fileName) 
	{
		return "<html>" + fileName + "</html>";  
	}

}
