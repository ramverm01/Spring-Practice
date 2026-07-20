package com.nit.SetterInjectUsingListSetAndMapTask01;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mall
{
	private int id;
	private String name;
	private Map<String, Double> parkingCharges;
	private Owner owner;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getParkingCharges() {
		return parkingCharges;
	}
	public void setParkingCharges(Map<String, Double> parkingCharges) {
		this.parkingCharges = parkingCharges;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Mall [id=" + id + ", name=" + name + ", parkingCharges=" + parkingCharges + ", owner=" + owner + "]";
	}
	
	
	
}