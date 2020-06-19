package edu.jspiders.oops.abstraction;
import java.util.Scanner;
public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		VehicleInfo vi= new VehicleInfo();
		
		System.out.println("Vehicle's Displayed are:");
		System.out.println("........................");
		
		System.out.println("1.Audi");
		System.out.println("2.BMW");
		System.out.println("3.Benz");
		System.out.println("Enter Your Choice");

		int choice= sc.nextInt();
		if(choice == 1)
		{
			vi.getVehicleInfo(new Audi());
		}
		else if(choice ==2)
		{
			vi.getVehicleInfo(new BMW());
		}
		else if(choice ==3)
		{
			vi.getVehicleInfo(new Benz());
		}
		else
		{
			System.out.println("Invalid Choice....");
		}	
	}
}
