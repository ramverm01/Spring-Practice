package com.springCore.Autowiting_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		String str = "com/springCore/Autowiting_02/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		Doctor doctor = context.getBean("doctor", Doctor.class);
		doctor.diagnose();
	}
}
