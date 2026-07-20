package com.springCore.Spring_ExamPractice_AutowiringByType_Task01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		String str="com/springCore/Spring_ExamPractice_AutowiringByType_Task01/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Car car = context.getBean(Car.class);
		System.out.println(car);
	}

}
