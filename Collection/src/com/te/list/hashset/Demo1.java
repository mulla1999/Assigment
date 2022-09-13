package com.te.list.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		Set<Integer> hashset = new HashSet<>();
		hashset.add(10);
		hashset.add(123);
		hashset.add(133);
		hashset.add(230);
		hashset.add(1330);
		
		List<Integer> arrayList = new ArrayList<>(hashset);
		Collections.sort(arrayList);
		
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);
			
		}
	}

}
