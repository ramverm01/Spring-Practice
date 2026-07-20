package com.springCore.Spring_ExamPractice_CustomAnnotation_Task03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FlightInfo
{
	String airline();
	String flightType();
	String terminal();
	double baggageLimit();
}
