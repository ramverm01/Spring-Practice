package com.springCore.Spring_ExamPractice_AutowiringByName_Task02;

public class Bank 
{
	private int bankId;
	private String bankName;
	private String branch;
	private String ifscCode;
	private String managerName;
	private Customer customer;
	
	public Bank() 
	{
		super();
	}

	public Bank(int bankId, String bankName, String branch, String ifscCode, String managerName, Customer customer) 
	{
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.managerName = managerName;
		this.customer = customer;
	}

	
	
	public int getBankId() 
	{
		return bankId;
	}

	public void setBankId(int bankId) 
	{
		this.bankId = bankId;
	}

	public String getBankName()
	{
		return bankName;
	}

	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}

	public String getBranch() 
	{
		return branch;
	}

	public void setBranch(String branch) 
	{
		this.branch = branch;
	}

	public String getIfscCode() {
	    return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
	    this.ifscCode = ifscCode;
	}

	public String getManagerName() 
	{
		return managerName;
	}

	public void setManagerName(String managerName) 
	{
		this.managerName = managerName;
	}

	public Customer getCustomer() 
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	@Override
	public String toString() 
	{
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", branch=" + branch + ", IFSCCode=" + ifscCode
				+ ", managerName=" + managerName + ", customer=" + customer + "]";
	}
	
	
}
