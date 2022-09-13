package com.te.thread;

public class Mythread implements Runnable {

	public void generateOtp() {
		System.out.println(Math.random() * 10000); // random() is method which return decimal value

	}

	@Override
	public void run() {
		generateOtp();
	}

}
