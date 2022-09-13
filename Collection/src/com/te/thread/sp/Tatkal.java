package com.te.thread.sp;

public class Tatkal {
	public static void main(String[] args) {
		Irctc irctc = new Irctc();
		User ravi = new User("Ravi", 55, irctc);
		User amir = new User("Amir", 20, irctc);
		User darshan = new User("Darshan", 30, irctc);
		ravi.start();
		amir.start();
		darshan.start();
	}

}
