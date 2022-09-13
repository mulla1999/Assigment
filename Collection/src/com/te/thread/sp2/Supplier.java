package com.te.thread.sp2;

public class Supplier extends Thread{
	Tonique tonique;
	String name;
	String brand;
	public Supplier(Tonique tonique, String name) {
		super();
		this.tonique = tonique;
		this.name = name;
			}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public void run() {
		System.out.println("Supplier");
		tonique.refillstock(brand,100);
	}
	


}
