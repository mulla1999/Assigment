package com.te.thread.sp;

public class Irctc {
	int availaibleTicket = 100;

	public synchronized void bookTicket(int tickets, String name) {
		System.out.println("Welcome to ITCTC " + name);
		System.out.println("How can I help you!!");
		if (availaibleTicket > tickets) {
			//availaibleTicket = availaibleTicket - tickets == it is use of (-=) this operator
			availaibleTicket -= tickets;
			System.out.println("Thank you for Booking... " + tickets + " Tickets.. Enjoy your Trip!! " + name);

		} else {
			System.err.println("Sorry ur late");
			return;

		}
		System.out.println("Number of tickets left == " + availaibleTicket);
	}

}
