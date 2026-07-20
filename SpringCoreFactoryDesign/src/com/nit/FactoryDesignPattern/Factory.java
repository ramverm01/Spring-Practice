package com.nit.FactoryDesignPattern;

public class Factory 
{
	public static Logic factoryMethod(String type)
	{
	    Logic data = null;

	    try
	    {
	        if(type.equalsIgnoreCase("WORD"))
	        {
	            Class<?> cls = Class.forName("com.nit.FactoryDesignPattern.WordMessageConverter");
	            data = (Logic) cls.getDeclaredConstructor().newInstance();
	        }
	        else if(type.equalsIgnoreCase("PDF"))
	        {
	            Class<?> cls = Class.forName("com.nit.FactoryDesignPattern.PDFMessageConverter");
	            data = (Logic) cls.getDeclaredConstructor().newInstance();
	        }
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }

	    return data;
	}
}
