package com.nit.SetterInjectUsingListSetAndMapTask01;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vehicle
{
	private int vehicleId;
	private String vehicleName;
	private List<String> features;
	private Set<String> fueltype;
	private Map<String, String> service;
	private Manufacturer manufacturer;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	public Set<String> getFueltype() {
		return fueltype;
	}
	public void setFueltype(Set<String> fueltype) {
		this.fueltype = fueltype;
	}
	public Map<String, String> getService() {
		return service;
	}
	public void setService(Map<String, String> service) {
		this.service = service;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", features=" + features
				+ ", fueltype=" + fueltype + ", service=" + service + ", manufacturer=" + manufacturer + "]";
	}
	
	
	
}