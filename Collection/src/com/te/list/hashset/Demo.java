package com.te.list.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<>();
		Student st2 = new Student(1,"Amir", "male");
		Student st3 = new Student(1,"Amir", "male");
		
		hashSet.add(st2);
		hashSet.add(new Student(2, "Darshana", "Female"));
		hashSet.add(new Student(3, "Bhawani", "Male"));
		hashSet.add(st3);
		hashSet.add(st2);


		
		System.out.println(st2.hashCode()+ ":::"+st3.hashCode());
		//List<Object> a = new ArrayList<>(hashSet);
	//	Collections.sort(hashSet, new s);

		
		Iterator<Student> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
			
		}
	}

}
