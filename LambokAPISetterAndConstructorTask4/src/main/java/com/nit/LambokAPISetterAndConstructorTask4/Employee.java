package com.nit.LambokAPISetterAndConstructorTask4;

import lombok.Data;

@Data
public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;
}
