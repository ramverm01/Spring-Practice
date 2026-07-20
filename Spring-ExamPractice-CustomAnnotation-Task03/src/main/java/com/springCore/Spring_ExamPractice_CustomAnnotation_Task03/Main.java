package com.springCore.Spring_ExamPractice_CustomAnnotation_Task03;

public class Main {

	public static void main(String[] args) 
	{
		Class<Flight> flight = Flight.class;
		if(flight.isAnnotationPresent(FlightInfo.class))
		{
			FlightInfo annotation = flight.getAnnotation(FlightInfo.class);
			System.out.println("AirLine :- "+annotation.airline());
			System.out.println("Flight type :- "+annotation.flightType());
			System.out.println("Terminal :- "+annotation.terminal());
			System.out.println("Baggage limint :- "+annotation.baggageLimit());
		}
		else
		{
			System.out.println("Invalid Annotation......");
		}
	}

}
