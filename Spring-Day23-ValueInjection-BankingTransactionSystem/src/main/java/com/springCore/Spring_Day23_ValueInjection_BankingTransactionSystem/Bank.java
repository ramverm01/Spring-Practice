package com.springCore.Spring_Day23_ValueInjection_BankingTransactionSystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:com/springCore/Spring_Day23_ValueInjection_BankingTransactionSystem/application.properties")
public class Bank 
{
	@Value("${accountHolderName}")
	private String accountHolderName;
	@Value("${accountNumber}")
	private long accountNumber;
	@Value("${balance}")
	private long balance;
	@Value("${withdrawAmount}")
	private long withdrawAmount;
	@Value("${depositeAmount}")
	private long depositeAmount;
	
	public Bank() 
	{
		super();
	}
		
	public long withdraw()
	{
		if(balance >= withdrawAmount)
		{
			balance = balance - withdrawAmount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		return balance;
	}
	
	public long deposit()
	{
	    balance = balance + depositeAmount;
	    return balance;
	}

	@Override
	public String toString() 
	{
		return "Bank [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", withdrawAmount=" + withdrawAmount + ", depositeAmount=" + depositeAmount + "]";
	}
	
	
}
