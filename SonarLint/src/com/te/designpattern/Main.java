package com.te.designpattern;

public class Main {
	public static void main(String[] args) {
		Singleton helper = Singleton.help();
		System.out.println(helper);
		Singleton a=  Singleton.s;
		System.out.println(a);
	}
	

}
