package spring_Day24_DependsOnLazy_Parking;

import org.springframework.stereotype.Component;

@Component
public class Company 
{
	public Company()
	{
		System.out.println("🚧 Activate Parking Gate Sensors");
		System.out.println("📷 Initialize CCTV Cameras");
		System.out.println("💳 Connect Payment Gateway");
		System.out.println("🖥️ Start Vehicle Detection System");
		System.out.println("✅ Display Parking System Ready");
	}
}
