package com.springCore.Spring_Day26_AutowiredByType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration 
{
	@Bean
	public Book book()
	{
		Book book = new Book(101, "The Tempest", "Willeam Shakespear");
		return book;
	}
	
	@Bean
	public Member member()
	{
		Member member = new Member(102, "Oma Prasad Sahu");
		return member;
	}
	
	@Bean
	public Librarian librarian()
	{
		Librarian librarian = new Librarian(103, "Janardan Dubey");
		return librarian;
	}
	
	@Bean
	public LibraryService libraryService()
	{
		LibraryService libraryService = new LibraryService();
		return libraryService;  
	}
}
