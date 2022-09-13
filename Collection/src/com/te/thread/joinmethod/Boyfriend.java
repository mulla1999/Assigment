package com.te.thread.joinmethod;

public class Boyfriend {
	public static void main(String[] args) {
		GirlFriend gf = new GirlFriend();
		Thread.currentThread().setName("Amir");
		gf.setName("Mistii");
		gf.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello....Come soon baby!!!" + " ==>" + Thread.currentThread().getName());

		}
		try {
			gf.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("She Reached>>>>");
		System.out.println("They go toghether to Restaurant");
		System.out.println("They will have Icecream....");
		System.out.println("And return back to their respective home");
		System.out.println("And say Good Night to each other!!!");

	}

}
