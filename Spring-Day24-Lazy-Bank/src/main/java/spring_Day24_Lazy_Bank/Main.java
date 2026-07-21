package spring_Day24_Lazy_Bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.springCore.Spring_Day24_DependsOn_Lazy_BankManagementSystem");
		BankOperation operation = ctx.getBean(BankOperation.class);
		operation.bankOpertaion();
	}

}
