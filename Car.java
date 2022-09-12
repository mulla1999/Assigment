package com.te.assignment;

import com.te.association.Address;

public abstract class Car {
	
	String ownerName;
	long vehicleNumber;
	String vehicleColor;
	registerAddress address;
	
	
	public abstract void start();
	public abstract void race();
	public abstract void stop();

}
