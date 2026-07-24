package com.springCore.Spring_Day26_AutowiredByType;

public class Book 
{
	private int id;
	private String name;
	private String authorName;
	
	public Book(int id, String name, String authorName) 
	{
		super();
		this.id = id;
		this.name = name;
		this.authorName = authorName;
	}
	
	public void displayBook()
	{
		System.out.println("Book Details");
		System.out.println("Book Id : "+id);
		System.out.println("Book Name : "+name);
		System.out.println("Author Name : "+authorName);
	}	
}
