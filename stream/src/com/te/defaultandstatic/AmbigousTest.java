package com.te.defaultandstatic;

public interface AmbigousTest {
	public default void m2() {
		System.out.println("this is default method from ambigous interface");
	}

}
