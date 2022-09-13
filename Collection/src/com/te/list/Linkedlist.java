package com.te.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add(10);
		l.add(11);
		l.add("Amir");
		l.add(13);
		l.add(14);
		l.add(15);
		//System.out.println(l);
		
		//printing using stream
		l.stream().forEach(System.out::println);
		
//		for (int i = 0; i < l.size(); i++) {
//			
//			System.out.println(l.get(i));
//			
//		}
//		System.out.println("==Using Advance for Loop==");
//		for (Object object : l) {
//			System.out.println(object);
//			
//		}
//		System.out.println("==Using Iterator==");
//		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//			
//		}
		
	}

}
