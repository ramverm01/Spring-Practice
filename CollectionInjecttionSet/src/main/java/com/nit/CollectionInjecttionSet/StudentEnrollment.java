package com.nit.CollectionInjecttionSet;

import java.util.Set;

public class StudentEnrollment 
{
	public Set<String> name;

	public StudentEnrollment() 
	{
		super();
	}

	public StudentEnrollment(Set<String> name) 
	{
		super();
		this.name = name;
	}

	public Set<String> getName() 
	{
		return name;
	}

	public void setName(Set<String> name) 
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "StudentEnrollment [name=" + name + "]";
	}
	
	
	
	
	
	
	
}
