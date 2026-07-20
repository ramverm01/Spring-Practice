package com.springCore.Spring_ExamPractice_AutowiringByName_Task02;

public class Customer 
{
	private int customerId;
	private String customerName;
	private long accountNumber;
	private String accountType;
	private double balance;
	private long mobileNumber;
	
	public Customer() 
	{
		super();
	}

	public Customer(int customerId, String customerName, long accountNumber, String accountType, double balance,
			long mobileNumber) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.mobileNumber = mobileNumber;
	}

	public int getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public long getAccountNumber() 
	{
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public String getAccountType() 
	{
		return accountType;
	}

	public void setAccountType(String accountType) 
	{
		this.accountType = accountType;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public long getMobileNumber() 
	{
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", accountNumber="
				+ accountNumber + ", accountType=" + accountType + ", balance=" + balance + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
}
