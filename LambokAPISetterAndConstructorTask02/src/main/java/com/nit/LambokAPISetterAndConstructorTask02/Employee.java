package com.nit.LambokAPISetterAndConstructorTask02;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;
}
