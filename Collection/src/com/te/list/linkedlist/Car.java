package com.te.list.linkedlist;

public class Car implements Comparable<Car>{
	private String vehicleName;
	private int vehiclePrice;
	private int modelNo;
	
	public Car(String vehicleName, int vehiclePrice, int modelNo) {
		super();
		this.vehicleName = vehicleName;
		this.vehiclePrice = vehiclePrice;
		this.modelNo = modelNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(int vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	@Override
	public String toString() {
		return "Car [vehicleName=" + vehicleName + ", vehiclePrice=" + vehiclePrice + ", modelNo=" + modelNo + "]";
	}
	@Override
	public int compareTo(Car o) {
		
		return this.modelNo-modelNo;
	}
	
	
	

}
