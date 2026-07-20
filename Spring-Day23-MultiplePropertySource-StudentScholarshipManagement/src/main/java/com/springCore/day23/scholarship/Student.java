package com.springCore.day23.scholarship;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
@PropertySource("classpath:com/springCore/Spring_Day23_MultiplePropertySource_StudentScholarshipManagement/application.properties")public class Student 
{
	@Value("${student_Name}")
	private String student_Name;
	@Value("${student_Id}")
	private int student_Id;
	@Value("${student_Percentage}")
	private double student_Percentage;
	@Value("${student_fee}")
	private long student_fee;
	@Value("${student_IsEligible}")
	private boolean student_IsEligible;
	
	public Student() 
	{
		super();
	}
	
	public long calculateScholarship()
	{
		if(student_Percentage >= 75 && student_IsEligible==true)
		{
			return 25000;
		}
		return 0;
	}   
	public long calculateRemainingFee()
	{
	    return student_fee - calculateScholarship();
	}

	@Override
	public String toString() 
	{
		return "Student [student_Name=" + student_Name + ", student_Id=" + student_Id + ", student_Percentage="
				+ student_Percentage + ", student_fee=" + student_fee + ", student_IsEligible=" + student_IsEligible
				+ "]";
	}
	
	
}
