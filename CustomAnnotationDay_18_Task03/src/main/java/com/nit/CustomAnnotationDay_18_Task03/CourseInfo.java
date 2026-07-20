package com.nit.CustomAnnotationDay_18_Task03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CourseInfo 
{
	String name();
	String trainer();
	int duration();
}
