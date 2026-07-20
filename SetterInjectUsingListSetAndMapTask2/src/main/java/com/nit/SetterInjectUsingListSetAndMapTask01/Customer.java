package com.nit.SetterInjectUsingListSetAndMapTask01;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer
{
	private int id;
	private String name;
	private List<String> number;
	
	private Address address;

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

	public List<String> getNumber() {
		return number;
	}

	public void setNumber(List<String> number) {
		this.number = number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", number=" + number + ", address=" + address + "]";
	}
	
	
}