package com.springCore.Spring_ExamPractice_AutowiringByType_Task01;

public class Car 
{
	private int carId;
	private String carName;
	private int model;
	private String colour;
	private double price;
	private Engine engine;
	
	public Car()
	{
		super();
	}

	public Car(int carId, String carName, int model, String colour, double price, Engine engine) 
	{
		super();
		this.carId = carId;
		this.carName = carName;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.engine = engine;
	}

	public int getCarId()
	{
		return carId;
	}

	public void setCarId(int carId) 
	{
		this.carId = carId;
	}

	public String getCarName() 
	{
		return carName;
	}

	public void setCarName(String carName)
	{
		this.carName = carName;
	}

	public int getModel()
	{
		return model;
	}

	public void setModel(int model) 
	{
		this.model = model;
	}

	public String getColour() 
	{
		return colour;
	}

	public void setColour(String colour)
	{
		this.colour = colour;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public Engine getEngine()
	{
		return engine;
	}

	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}

	@Override
	public String toString() 
	{
		return "Car [carId=" + carId + ", carName=" + carName + ", model=" + model + ", colour=" + colour + ", price="
				+ price+" lakh" + ", engine=" + engine + "]";
	}
	
	
}
