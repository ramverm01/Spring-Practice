package com.springCore.Autowiting_02;

import org.springframework.beans.factory.annotation.Autowired;

public class Doctor 
{
	private Patient patient;

	@Autowired
	public Doctor(Patient patient) 
	{
		super();
		this.patient = patient;
	}
	
	public void diagnose() 
	{
		System.out.println("Doctor Started Diagnosis");
		patient.treatment();
	}
}
