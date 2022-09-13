package com.te.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Company {
	public static void main(String[] args) {

		ArrayList<Employee> arraylist = new ArrayList<>();
		arraylist.add(new Employee(161, "Amir", 10008.00));
		arraylist.add(new Employee(112, "Pushpa", 50000.00));
		arraylist.add(new Employee(14, "Salman", 25000.8787));
		
		
//without user inpute to run a program use for loop
		//for (Employee emp : arraylist) {
		//	System.out.println(emp);
		//}
		
		//for (Employee emp : arraylist) {
		//	System.out.println(emp);
		//}
		
//to print all below mention code in one line 
//	arraylist.stream().sorted(new SortingonName()).forEach(System.out::print);
		
		System.out.println("What based you want to sort the Data!!");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		
		if (next.equalsIgnoreCase("name")) {
			
			System.out.println("=====Sorting By Name=======");
			Collections.sort(arraylist, new SortingonName());
		}
		
		if (next.equalsIgnoreCase("salary")) {
			System.out.println("=====Sorting By Salary=======");
			Collections.sort(arraylist, new SortingonSalary());
			
		}
		if (next.equalsIgnoreCase("id")) {
			System.out.println("=====Sorting By ID=======");
			Collections.sort(arraylist);
			
		}
		for (Employee emp : arraylist) {
			System.out.println(emp);
		}


	}

}
