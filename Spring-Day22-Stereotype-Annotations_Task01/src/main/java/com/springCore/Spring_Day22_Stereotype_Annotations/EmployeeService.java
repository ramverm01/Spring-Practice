package com.springCore.Spring_Day22_Stereotype_Annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService 
{
	public void displayEmployeeDetails()
	{
		System.out.println("Employee details loaded successfully");
	}
}
