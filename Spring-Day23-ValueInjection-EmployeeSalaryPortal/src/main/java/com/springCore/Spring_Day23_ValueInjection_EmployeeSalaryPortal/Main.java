package com.springCore.Spring_Day23_ValueInjection_EmployeeSalaryPortal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com.springCore.Spring_Day23_ValueInjection_EmployeeSalaryPortal";
		ApplicationContext context = new AnnotationConfigApplicationContext(str);
		Employee employee = context.getBean("ForAllEmployee", Employee.class);
		System.out.println(employee);
		System.out.print("The increamented salary of Employee :- ");
		System.out.println(employee.getIncrementSalary());
	}

}
