package com.nit.SpringCore_AutowiringusingbyType;

public class Patient 
{
	private int patientId;
	private String patientName;
	private String disease;
	private Doctor doctor;
	
	public Patient() 
	{
		super();
	}

	public int getPatientId() 
	{
		return patientId;
	}

	public void setPatientId(int patientId)
	{
		this.patientId = patientId;
	}

	public String getPatientName()
	{
		return patientName;
	}

	public void setPatientName(String patientName) 
	{
		this.patientName = patientName;
	}

	public String getDisease() 
	{
		return disease;
	}

	public void setDisease(String disease) 
	{
		this.disease = disease;
	}

	public Doctor getDoctor()
	{
		return doctor;
	}

	public void setDoctor(Doctor doctor) 
	{
		this.doctor = doctor;
	}

	@Override
	public String toString() 
	{
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease + ", doctor="
				+ doctor + "]";
	}	
}
