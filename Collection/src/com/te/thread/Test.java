package com.te.thread;

public class Test extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 11; i <= 20; i++) {
		if (i==14) {
			throw new RuntimeException();
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(i+" == User 2");
			
		}
	}
	public static void main(String[] args)throws InterruptedException {
		Thread thread= new Test();
		thread.start(); //method is present in thread class. It is use to create new stacks
		thread.setName("Amir");
		thread.setPriority(10);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+" ==User 1");
			
		}
	}
	
    
	

}
