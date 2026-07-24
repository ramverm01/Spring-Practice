package com.springCore.Spring_Day26_AutowiredByType;

public class Member 
{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) 
	{
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public void displayMember()
	{
		System.out.println("Member Details");
		System.out.println("Member Id : "+memberId);
		System.out.println("Member Name :"+memberName);
	}
}
