package com.springCore.day23.scholarship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/Spring_Day23_MultiplePropertySource_StudentScholarshipManagement/application-context.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student);

        System.out.println("--------------------------------");

        System.out.println("Scholarship : ₹" + student.calculateScholarship());

        System.out.println("Remaining Fee : ₹" + student.calculateRemainingFee());   
       
    }
}