package com.nit.LambokAPISetterAndConstructorTask3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;
}
