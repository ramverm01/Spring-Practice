package com.nit.SetterInjectUsingListSetAndMapTask01;

public class Manufacturer
{
	private int manufacturerId;
	private String manufacturerName;
	private String country;
	public int getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Manufacturer [manufacturerId=" + manufacturerId + ", manufacturerName=" + manufacturerName
				+ ", country=" + country + "]";
	}
	
	
	
	
	
	
}
