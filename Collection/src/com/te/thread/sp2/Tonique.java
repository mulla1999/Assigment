package com.te.thread.sp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Tonique {
	List<String> brand = Arrays.asList("Old Monk", "Oak smith Gold", "Signature", "Teacher");
	int quantity;

	public synchronized void buy(String name, int numberOfBottels) {
		Boolean b = brand.stream().anyMatch(x -> x.equals((String) name));
		if (b) {
			System.out.println("Here is your brand " + name);
			System.out.println("Here are your bottels, Don't Drink and Drive");
			quantity -= numberOfBottels;

		} else {
			System.out.println("Wait the stock will be refilled");
			try {
				this.wait();
				System.out.println("Thanks for waiting and Here is your Drink ");
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}

	public synchronized void refillstock(String name, int quantity) {
		HashSet<String> hashset = new HashSet<>(brand);
		hashset.add(name);
		ArrayList<String> arrayList = new ArrayList<>(hashset);
		brand = arrayList;
		this.quantity += quantity;
		this.notify();

	}
}
