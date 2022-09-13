package com.te.thread.joinmethod;

public class GirlFriend extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("I am on my way!! Hold on i am on a minutes  "+" ===>"+Thread.currentThread().getName());

		}
		// System.out.println(" ");

	}

}
