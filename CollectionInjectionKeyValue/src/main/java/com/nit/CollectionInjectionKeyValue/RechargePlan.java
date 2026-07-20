package com.nit.CollectionInjectionKeyValue;

import java.util.Map;

public class RechargePlan 
{
	public Map<String, Integer> recharge;

	public RechargePlan() 
	{
		super();
	}

	public RechargePlan(Map<String, Integer> recharge) 
	{
		super();
		this.recharge = recharge;
	}

	public Map<String, Integer> getRecharge() 
	{
		return recharge;
	}

	public void setRecharge(Map<String, Integer> recharge) 
	{
		this.recharge = recharge;
	}

	@Override
	public String toString() 
	{
		return "RechargePlan [recharge=" + recharge + "]";
	}		
}
