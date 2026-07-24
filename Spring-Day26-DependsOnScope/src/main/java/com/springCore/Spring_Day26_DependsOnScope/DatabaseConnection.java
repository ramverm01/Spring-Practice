package com.springCore.Spring_Day26_DependsOnScope;

public class DatabaseConnection 
{
	private String databaseName;
	
	public DatabaseConnection(String databaseName) 
	{
		super();
		this.databaseName = databaseName;
	}



	public void connectDatabase()
	{
		System.out.println(databaseName+" Database Connected Successfully... ");
	}
}
