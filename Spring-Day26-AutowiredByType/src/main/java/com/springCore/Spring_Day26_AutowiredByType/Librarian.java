package com.springCore.Spring_Day26_AutowiredByType;

public class Librarian 
{
	private int librarianId;
	private String librarianName;
	
	public Librarian(int librarianId, String librarianName) 
	{
		super();
		this.librarianId = librarianId;
		this.librarianName = librarianName;
	}
	
	public void displayLibrarian()
	{
		System.out.println("Librarian Details");
		System.out.println("Librarian Id : "+librarianId);
		System.out.println("Librarian Name : "+librarianName);
	}
}
