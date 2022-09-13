package com.te.designpattern;

public class Singleton {
	
	static Singleton s = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton help() {
		
		return s;
	}

}
