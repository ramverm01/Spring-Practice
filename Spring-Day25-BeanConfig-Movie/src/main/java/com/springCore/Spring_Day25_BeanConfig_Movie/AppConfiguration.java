package com.springCore.Spring_Day25_BeanConfig_Movie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration 
{
	@Bean
	public PaymentGateway paymentGateway()
	{
		return new PaymentGateway();
	}
	
	@Bean
	public MovieTicket movieTicket()
	{
		return new MovieTicket(paymentGateway());
	}
}
