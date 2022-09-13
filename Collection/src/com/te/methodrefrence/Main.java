package com.te.methodrefrence;
//this program of method ref for non static methods and static and constructor
public class Main {
	
	public Main(){
		System.err.println("this is constructor");
	}
	
	
	public void test() {
		System.out.println("Kasa kay pahune!!!");
		//also you can write business logic here
	}
	public static void demo() {
		System.out.println("Macha yaha dekho!! vaha nahi!");
		//also you can write business logic here
	}
	public static void main(String[] args) {
		Main main = new Main();
		Methodref m = main::test;
		m.m1();
		//accessing constructor
		Methodref b = Main::new;
		//b.m1();
		//accessing static method
		Methodref a = Main::demo;
		a.m1();
	}
}
