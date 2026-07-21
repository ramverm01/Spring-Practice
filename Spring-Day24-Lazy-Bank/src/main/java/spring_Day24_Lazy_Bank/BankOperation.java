package spring_Day24_Lazy_Bank;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("startup")
public class BankOperation 
{
	@Autowired
	Report report;
	double balance;

	public void bankOpertaion() 
	{
		while(true)
		{
			System.out.println("Enter your choice :- ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 for Deposite amount...");
			System.out.println("Press 2 for withdraw amount...");
			System.out.println("Press 3 for check balance.....");
			System.out.println("press 4 for generate report...");
			System.out.println("Press 5 for Exit...");
			int key = sc.nextInt();

			switch (key) 
			{
			case 1: 
			{
				System.out.println("Enter deposite amount :- ");
				double depositeAmount=sc.nextDouble();
				deposite(depositeAmount);
			}
			break;
			case 2: 
			{
				System.out.println("Enter the withdraw amount :- ");
				double withdrawAmount = sc.nextDouble();
				withdraw(withdrawAmount);
			}
			break;
			case 3:
			{
				System.out.println("the total balance is :- ");
				checkBalance();			
			}
			break;
			
			
			case 4:
			{
				report.generateReport();
			}
			break;
			
			case 5:
			{
				System.out.println("Thankyou......");
				System.exit(0);
			}
						
			}

		}
	}

	public void deposite(double depositeAmount) 
	{
		balance = balance + depositeAmount;
		System.out.println("Deposite Successfull....");
	}
	public void withdraw(double withdrawAmount)
	{
		balance = balance - withdrawAmount;
		System.out.println("Withdraw Successfull....");
	}
	public void checkBalance()
	{
		System.out.println("The total balance :- "+balance);
		System.out.println("The amount is checked successfully....");
	}
}
