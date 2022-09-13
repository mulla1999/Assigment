package com.te.list.linkedlist;

import java.util.LinkedList;

public class Customer {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add(new Car("Kawasaki", 450000,650));
		l.add(new Car("BMW", 1500000,850));
		l.add(new Car("Hornet", 120000,160));
		
		//Collections.sort(l);
		
		System.out.println("=====For Loop=====");
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println(l);
		}
		
		System.out.println("=======Advance For Loop======");
		for (Object obj : l) {
			System.out.println(obj);
			
		}
	}

}
