package com.nit.AllThreeCollectionTypes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library
{
	private List<String> bookIssued;
	private Set<String> mailId;
	private Map<String, Integer> bookCopies;
	
	public Library() 
	{
		super();
	}

	public Library(List<String> bookIssued, Set<String> mailId, Map<String, Integer> bookCopies) 
	{
		super();
		this.bookIssued = bookIssued;
		this.mailId = mailId;
		this.bookCopies = bookCopies;
	}

	public List<String> getBookIssued()
	{
		return bookIssued;
	}

	public void setBookIssued(List<String> bookIssued)
	{
		this.bookIssued = bookIssued;
	}

	public Set<String> getMailId()
	{
		return mailId;
	}

	public void setMailId(Set<String> mailId) 
	{
		this.mailId = mailId;
	}

	public Map<String, Integer> getBookCopies()
	{
		return bookCopies;
	}

	public void setBookCopies(Map<String, Integer> bookCopies) 
	{
		this.bookCopies = bookCopies;
	}

	@Override
	public String toString()
	{
		return "Library [bookIssued=" + bookIssued + ", mailId=" + mailId + ", bookCopies=" + bookCopies + "]";
	}
	
}
