package com.te.list;

import java.util.ArrayList;
import java.util.Iterator;



public class ArraylistDemo {
	public static void main(String[] args) {
		System.out.println("Program Start");
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(10);
		a.add("Amir");
		a.add('a');
		a.add(10.2);
		a.add(true);
		a.add(null);
		System.out.println("===Using for loop===");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		
		System.out.println("===Using Advance for loop===");
		for(Object obj:a) {
			System.out.println(obj);
		}
		System.out.println("===Using iterator===");
		Iterator<Object> iterator = a.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Program End");
	}

}
