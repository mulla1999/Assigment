package com.te.assignment;

import java.util.Scanner;

import com.te.association.Address;
import com.te.association.Employee;


public class Owner {
	
	public static void main(String[] args) {
		
		
	
		
		registerAddress address = new registerAddress();
		address.houseName="Radhika Apt";
		address.buildingNo="07";
		address.landmark="Near your house";
		address.pinCode=421306;
		address.cylinder=4;
		address.Litersengin="14Liters";
		address.strokes=4;
		
		registerAddress address1 = new registerAddress();
		address1.houseName="Krushna Apt";
		address1.buildingNo="03";
		address1.landmark="Near To you";
		address1.pinCode=421506;
		address1.cylinder=4;
		address1.Litersengin="18Liters";
		address1.strokes=4;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Audi");
		System.out.println("Enter 2 for Thar");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Thanks For Choose Audi");
			Car car = new Audi();
			car.ownerName="Amir";
			car.vehicleColor="Black";
			car.vehicleNumber=7877;
			car.address=address;  
			System.out.println("====================");
			
			System.out.println("Owner Name "+car.ownerName);
			System.out.println("Vehicle Color "+car.vehicleColor);
			System.out.println("Vehicle No "+car.vehicleNumber);
			System.out.println( "House Name "+car.address.strokes);
			System.out.println( "House Name "+car.address.Litersengin);
			System.out.println( "House Name "+car.address.cylinder);
			System.out.println( "House Name "+car.address.houseName);
			System.out.println("Bldg No "+car.address.buildingNo);
			System.out.println("Landmark "+car.address.landmark);
			System.out.println("Pin Code "+car.address.pinCode);
			car.start();
			car.race();
			car.start();
			break;
			
		case 2 :
			System.out.println("Thanks For Choose Thar");
			System.out.println("====================");
			Car cars = new Thar();
			cars.ownerName="salman";
			cars.vehicleColor="Grey";
			cars.vehicleNumber=7786;
			
			
			Car car2 = new Thar();
			car2.address=address1; 
			System.out.println("====================");
			System.out.println("Owner Name "+cars.ownerName);
			System.out.println("Vehicle Color "+cars.vehicleColor);
			System.out.println("Vehicle No "+ cars.vehicleNumber);
			System.out.println("House Name "+car2.address.cylinder);
			System.out.println("House Name "+car2.address.Litersengin);
			System.out.println("House Name "+car2.address.strokes);
			System.out.println("House Name "+car2.address.houseName);
			System.out.println("Bldg No "+car2.address.buildingNo);
			System.out.println("Landmark "+car2.address.landmark);
			System.out.println("Pin Code "+car2.address.pinCode);
			car2.start();
			car2.race();
			car2.start();
			break;
			
	}
		
	}

}
