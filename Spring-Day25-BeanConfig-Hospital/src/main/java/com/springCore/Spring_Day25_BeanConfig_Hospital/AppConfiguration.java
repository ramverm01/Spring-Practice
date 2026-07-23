package com.springCore.Spring_Day25_BeanConfig_Hospital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration 
{
	@Bean
	public DoctorService doctorService()
	{
		return new DoctorService();
	}
	
	@Bean
	public Appointment appointment()
	{
		return new Appointment(doctorService());
	}
	
}
