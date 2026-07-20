package com.springCore.Spring_Day22_Stereotype_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		String str = "com/springCore/Spring_Day22_Stereotype_Annotations/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.displayEmployeeDetails();
	}

}
