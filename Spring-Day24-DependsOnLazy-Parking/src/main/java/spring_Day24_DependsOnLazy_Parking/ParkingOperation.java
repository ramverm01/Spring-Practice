package spring_Day24_DependsOnLazy_Parking;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("company")
public class ParkingOperation 
{
	@Autowired
	Report report;
	private int numberOfVehicleSlot = 100;
	public void parkingOperation()                
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 for Vehicle Entry.....");
			System.out.println("Press 2 for Vehicle Exit......");
			System.out.println("Press 3 for Show Available Parking Slots...");
			System.out.println("press 4 for daily generate report...");
			System.out.println("Press 5 for Exit...");
			int key = sc.nextInt();
			switch (key) 
			{
			case 1:
			{
				System.out.println("Enter the value of entry of vehicle ");
				int entryvehicle = sc.nextInt();
				vehicleEntry(entryvehicle);				
			}			
				break;
			case 2:
			{
				System.out.println("Enter the value of exit of vehicle ");
				int exitVehicle = sc.nextInt();
				vehicleExit(exitVehicle);
			}			
				break;
			case 3:
			{
				availableParkingSlots();
			}			
				break;
			case 4:
			{
				report.getReport();
			}			
				break;
			case 5:
			{
				System.exit(0);
			}			
				break;

			default:
			    System.out.println("Invalid Choice!");
			}
			
		}
	}
	public void vehicleEntry(int entryVehicle)
	{
	    if(entryVehicle > numberOfVehicleSlot)
	    {
	        System.out.println("Parking is Full! Not enough slots available.");
	    }
	    else
	    {
	        numberOfVehicleSlot -= entryVehicle;
	        System.out.println("Vehicle entered successfully.");
	        System.out.println("Available Slots : " + numberOfVehicleSlot);
	    }
	}
	public void vehicleExit(int exitVehicle)
	{
		numberOfVehicleSlot = numberOfVehicleSlot+exitVehicle;
		System.out.println("Vehicle exited successfully.");
		System.out.println("Available Parking Slots : " + numberOfVehicleSlot);
	}
	public void availableParkingSlots()
	{
		System.out.println("Available Parking Slots are :- "+numberOfVehicleSlot);
	}
	
}
