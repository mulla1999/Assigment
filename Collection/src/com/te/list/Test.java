package com.te.list;

public class Test extends Demo{

	@Override
	public void m1() {
		System.out.println("This is Overriden Method");
	}
	public static void main(String[] args) {
		Demo demo = new Test();
		demo.m1();
	}
	

}
