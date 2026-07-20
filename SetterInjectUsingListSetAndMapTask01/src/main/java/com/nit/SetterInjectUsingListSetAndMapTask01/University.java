package com.nit.SetterInjectUsingListSetAndMapTask01;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class University
{
	private int id;
	private String name;
	private List<String> department;
	private Set<String> campusFacilities;
	private Map<String, Integer> academicPrograms;
	ViceChancellor viceChancellor;
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
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	public Set<String> getCampusFacilities() {
		return campusFacilities;
	}
	public void setCampusFacilities(Set<String> campusFacilities) {
		this.campusFacilities = campusFacilities;
	}
	public Map<String, Integer> getAcademicPrograms() {
		return academicPrograms;
	}
	public void setAcademicPrograms(Map<String, Integer> academicPrograms) {
		this.academicPrograms = academicPrograms;
	}
	public ViceChancellor getViceChancellor() {
		return viceChancellor;
	}
	public void setViceChancellor(ViceChancellor viceChancellor) {
		this.viceChancellor = viceChancellor;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", department=" + department + ", campusFacilities="
				+ campusFacilities + ", academicPrograms=" + academicPrograms + ", viceChancellor=" + viceChancellor
				+ "]";
	}
	
	
	
}
