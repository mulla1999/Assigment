package com.te.defaultandstatic;

public interface Test {
	public static void m1() {
		System.out.println("this is static method");
	}

	public default void m2() {
		System.out.println("this is default method");
	}

}
