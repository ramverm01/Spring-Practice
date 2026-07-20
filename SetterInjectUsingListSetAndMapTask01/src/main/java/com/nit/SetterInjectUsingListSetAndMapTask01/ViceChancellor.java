package com.nit.SetterInjectUsingListSetAndMapTask01;

public class ViceChancellor
{
	private String viceChancellorName;
	private String qualification;
	private int experience;
	public String getViceChancellorName() {
		return viceChancellorName;
	}
	public void setViceChancellorName(String viceChancellorName) {
		this.viceChancellorName = viceChancellorName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "ViceChancellor [viceChancellorName=" + viceChancellorName + ", qualification=" + qualification
				+ ", experience=" + experience + "]";
	}
	
	
}
