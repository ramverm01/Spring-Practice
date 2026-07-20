package com.nit.SetterInjectionwithPrimitiveType;

public class Library 
{
	private Book book;

	public Book getBook()
	{
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}

	
}
