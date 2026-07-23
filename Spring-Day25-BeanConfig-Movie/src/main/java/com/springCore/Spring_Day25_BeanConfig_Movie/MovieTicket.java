package com.springCore.Spring_Day25_BeanConfig_Movie;

public class MovieTicket 
{
	PaymentGateway paymentGateway;
	public MovieTicket(PaymentGateway paymentGateway)
	{
		this.paymentGateway = paymentGateway;
	}
	
	 public void bookTicket()
	 {
		 System.out.println("Movie Ticket Booked....!");
		 paymentGateway.makePayment();
	 }
	
}
