package com.nit.SpringCore_AutowiringusingbyName;

public class DeliveryPartner 
{
	private int id;
	private String name;
	private String vehicleType;
	
	public DeliveryPartner() 
	{
		super();
	}

	public DeliveryPartner(int id, String name, String vehicleType) 
	{
		super();
		this.id = id;
		this.name = name;
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() 
	{
		return "DeliveryPartner [id=" + id + ", name=" + name + ", vehicleType=" + vehicleType + "]";
	}	
}
