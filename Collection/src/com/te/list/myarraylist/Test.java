package com.te.list.myarraylist;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add("Amir");
		a.add(16);
		a.add(17);
		a.add(18);
		a.add(19);
		a.add('C');
		a.add(21);
		a.add(22);
		a.add(23);
		a.add(24);
		a.add(25);
		System.err.println(a.size());
		a.remove(21);
		
		

		Iterator<Object> iterator = a.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
