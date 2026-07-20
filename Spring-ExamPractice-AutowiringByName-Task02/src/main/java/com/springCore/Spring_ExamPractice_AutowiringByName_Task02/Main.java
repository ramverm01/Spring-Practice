package com.springCore.Spring_ExamPractice_AutowiringByName_Task02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		String str = "com/springCore/Spring_ExamPractice_AutowiringByName_Task02/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Bank bank = context.getBean("bank", Bank.class);
		System.out.println(bank);
	}

}
