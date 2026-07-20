package com.springCore.Spring_Day23_ValueInjection_EmployeeSalaryPortal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ForAllEmployee")
@Scope("prototype")
@PropertySource("classpath:com/springCore/Spring_Day23_ValueInjection_EmployeeSalaryPortal/application.properties")
public class Employee 
{
	@Value("${Employee_name}")
	private String employee_name;
	@Value("${Employee_id}")
	private String employee_id;
	@Value("${Employee_experience}")
	private int employee_experience;
	@Value("${Employee_projectCompleted}")
	private boolean employee_projectCompleted;
	@Value("${Employee_basicSalary}")
	private long employee_basicSalary;

	public Employee() {
		super();
	}

	public long getIncrementSalary()
	{
		if(employee_projectCompleted)
		{
			employee_basicSalary = employee_basicSalary+50000;
		}
		return employee_basicSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employee_name=" + employee_name + ", employee_id=" + employee_id + ", employee_experience="
				+ employee_experience + ", employee_projectCompleted=" + employee_projectCompleted
				+ ", employee_basicSalary=" + employee_basicSalary + "]";
	}

			
}
