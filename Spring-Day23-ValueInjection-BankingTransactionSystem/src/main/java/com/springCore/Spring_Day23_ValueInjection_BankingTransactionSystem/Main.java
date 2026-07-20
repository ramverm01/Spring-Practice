package com.springCore.Spring_Day23_ValueInjection_BankingTransactionSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springCore.Spring_Day23_ValueInjection_BankingTransactionSystem");
		Bank bank = context.getBean("bank", Bank.class);
		System.out.println(bank);
		System.out.println("Deposite :- "+bank.deposit());
		System.out.println("Withdraw :- "+bank.withdraw());
	}

}
