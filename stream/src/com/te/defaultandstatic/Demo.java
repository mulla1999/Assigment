package com.te.defaultandstatic;

public class Demo implements Test,AmbigousTest{

	@Override
	public void m2() {
		System.out.println("Overriden Method");
		AmbigousTest.super.m2();
		Test.super.m2();
	}
	public static void main(String[] args) {
		Demo demo= new Demo();
		demo.m2();
		
	}
	

}
