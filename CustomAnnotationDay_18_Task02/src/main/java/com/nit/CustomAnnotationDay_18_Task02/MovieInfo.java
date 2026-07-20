package com.nit.CustomAnnotationDay_18_Task02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MovieInfo 
{
	String nameOfMovie();
	String directerOfMovie();
	int releaseYear();
	
}
