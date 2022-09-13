package com.te.thread;

//thread using Runnable interface
public class Main {
	public static void main(String[] args) {
		Thread thread = new Thread(new Mythread());// making Thread as an Runnable interface type

		Thread thread2 = new Thread(new Mythread());
		thread.start();
		thread2.start();
		thread.setPriority(10);
	}

}
