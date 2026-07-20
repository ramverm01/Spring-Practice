package com.nit.CustomAnnotationTask01;

public class Main {

	public static void main(String[] args)
	{
		Class<Employee> emp = Employee.class;
		if(emp.isAnnotationPresent(EmployeeInfo.class))
		{
			EmployeeInfo annotation = emp.getAnnotation(EmployeeInfo.class);
			System.out.println("id :- "+annotation.id());
			System.out.println("name :- "+annotation.name());
			System.out.println("department :- "+annotation.department());
		}
		else
		{
			System.out.println("Annotation Not found");
		}
		
	}

}
