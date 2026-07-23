package com.springCore.Spring_Day25_BeanConfig_Hospital;

import org.springframework.stereotype.Component;

@Component
public class Appointment 
{
	DoctorService doctorService;
	public Appointment(DoctorService doctorService)
	{
		this.doctorService = doctorService;
	}
	
	public void bookAppointment()
	{
		System.out.println("Appointment Booked Successfully....!");
		doctorService.consult();
	}
}
