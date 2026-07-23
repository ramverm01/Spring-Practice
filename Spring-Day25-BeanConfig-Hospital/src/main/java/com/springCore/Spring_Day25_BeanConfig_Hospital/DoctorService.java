package com.springCore.Spring_Day25_BeanConfig_Hospital;

import org.springframework.stereotype.Component;

@Component
public class DoctorService 
{
	public void consult()
	{
		System.out.println("Doctor Consultation Completed....!");
	}
}
