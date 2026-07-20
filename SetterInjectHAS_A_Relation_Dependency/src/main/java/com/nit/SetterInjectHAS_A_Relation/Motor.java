package com.nit.SetterInjectHAS_A_Relation;

public class Motor 
{
	private int motorId;

	public int getMotorId() {
		return motorId;
	}

	public void setMotorId(int motorId) {
		this.motorId = motorId;
	}

	@Override
	public String toString() {
		return "Motor [motorId=" + motorId + "]";
	}
	
	
	
}
