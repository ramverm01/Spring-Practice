package com.nit.SingletonScopeTask01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ConfigurationManager 
{
	private String applicationName;
	private String environment;
	
	public String getApplicationName()
	{
		return applicationName;
	}
	public void setApplicationName(String applicationName)
	{
		this.applicationName = applicationName;
	}
	public String getEnvironment()
	{
		return environment;
	}
	public void setEnvironment(String environment)
	{
		this.environment = environment;
	}
	@Override
	public String toString() {
		return "ConfigurationManager [applicationName=" + applicationName + ", environment=" + environment + "]";
	}
	
	
	
	
}
