package com.te.defaultandstatic;

public class Main implements Test {

	@Override
	public void m2() {
		System.out.println("This is overridden method");
	}

	public static void main(String[] args) {
		Test.m1();
		Main main = new Main();
		main.m2();

	}

}
