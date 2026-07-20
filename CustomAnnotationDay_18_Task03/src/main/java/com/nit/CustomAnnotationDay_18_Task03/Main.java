package com.nit.CustomAnnotationDay_18_Task03;

public class Main {

	public static void main(String[] args) 
	{
		Class<Course> cource = Course.class;
		if(cource.isAnnotationPresent(CourseInfo.class))
		{
			CourseInfo annotation = cource.getAnnotation(CourseInfo.class);
			System.out.println("Name :- "+annotation.name());
			System.out.println("Trainer :- "+annotation.trainer());
			System.out.println("Duration :- "+60+" Days");
		}
		else
		{
			System.out.println("Annotation is not generated....!");
		}
	}

}
