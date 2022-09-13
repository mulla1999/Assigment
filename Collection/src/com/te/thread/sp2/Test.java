package com.te.thread.sp2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Tonique tonique = new Tonique();
		Customer bhagu = new Customer(tonique, "Bhagwat", "Signature");
		Customer mohit = new Customer(tonique, "Mohit", "Oak smith Gold");
		Customer vinayak = new Customer(tonique, "Vinayak", "100 Pipers");
		bhagu.start();
		mohit.start();
		vinayak.start();
		Supplier dheeraj = new Supplier(tonique, "Dheeraj");
		dheeraj.setBrand("100 Pipers");
		Thread.sleep(1000);
		dheeraj.start();

	}

}
