package com.te.list.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.te.list.hashset.Student;

public class Demo {
	public static void main(String[] args) {
		Set<Student> treeset = new TreeSet<>();
		treeset.add(new Student(2, "Darshana", "Female"));
		treeset.add(new Student(3, "Rashmika", "Female"));
		treeset.add(new Student(1, "Amir", "Male"));
		
		Iterator<Student> iterator = treeset.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
			
		}
	}

}
