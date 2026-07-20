package com.nit.FactoryDesignPattern;

public class PDFMessageConverter implements Logic
{

	@Override
	public String convertTo(String fileName) 
	{
		return "<PDF>"+fileName+"</PDF>";
	}

}
