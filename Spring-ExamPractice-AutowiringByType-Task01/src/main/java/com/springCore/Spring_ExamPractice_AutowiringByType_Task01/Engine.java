package com.springCore.Spring_ExamPractice_AutowiringByType_Task01;

public class Engine 
{
	private int engineId;
	private String engineType;
	private int horsePower;
	private String fuelType;
	private int engineCapacity;
	private String manufacturer;
	
	public Engine() 
	{
		super();
	}

	public Engine(int engineId, String engineType, int horsePower, String fuelType, int engineCapacity,
			String manufacturer)
	{
		super();
		this.engineId = engineId;
		this.engineType = engineType;
		this.horsePower = horsePower;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.manufacturer = manufacturer;
	}

	public int getEngineId()
	{
		return engineId;
	}

	public void setEngineId(int engineId) 
	{
		this.engineId = engineId;
	}

	public String getEngineType() 
	{
		return engineType;
	}

	public void setEngineType(String engineType) 
	{
		this.engineType = engineType;
	}

	public int getHorsePower() 
	{
		return horsePower;
	}

	public void setHorsePower(int horsePower) 
	{
		this.horsePower = horsePower;
	}

	public String getFuelType() 
	{
		return fuelType;
	}

	public void setFuelType(String fuelType)
	{
		this.fuelType = fuelType;
	}

	public int getEngineCapacity() 
	{
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) 
	{
		this.engineCapacity = engineCapacity;
	}

	public String getManufacturer() 
	{
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) 
	{
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() 
	{
		return "Engine [engineId=" + engineId + ", engineType=" + engineType + ", horsePower=" + horsePower
				+ ", fuelType=" + fuelType + ", engineCapacity=" + engineCapacity + ", manufacturer=" + manufacturer
				+ "]";
	}
	
	
}
