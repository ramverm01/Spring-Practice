package com.springCore.Autowiring_03;

import org.springframework.beans.factory.annotation.Autowired;

public class Library 
{
	@Autowired
	private Book book;
	
	public void issueBook() 
	{
		System.out.println("Library Processing Request...");
		book.bookInfo();
	}
}
