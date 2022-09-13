package com.te.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Amir");
		map.put(2,"Pushpa");
		map.put(3,"Rocky");
		map.put(4,"Sanju");
		
		
		
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println(key + " :: "+ map.get(key));
			
			
			
		}
		
		
	}

}
