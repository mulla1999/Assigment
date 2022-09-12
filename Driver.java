package com.te.assignment;

import java.util.Scanner;

import com.te.abstraction.Reliance;
import com.te.abstraction.RelianceDegital;
import com.te.abstraction.relianceSmart;

public class Driver {

	public void help() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1 to visit Reliance Degital or 2 for Reliance Smart");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Please Enter 1 for Buy and 2 for Sell and 3 for EMI");
			n = sc.nextInt();
			Reliance r = new RelianceDegital();
			switch (n) {
			case 1:
				r.buy();
				break;
			case 2:
				r.sell();
				break;
			case 3:
				r.emi();
				break;
			default: {
				System.out.println("Please Enter valid Inpute");
			}

			}
		}

		if (n == 2) {
			n = sc.nextInt();
			Reliance r1 = new relianceSmart();
			switch (n) {
			case 1:
				r1.buy();
				break;
			case 2:
				r1.sell();
				break;
			case 3:
				r1.emi();
				break;
			default: {
				System.out.println("Please Enter valid Inpute");
			}

			}

		}
	}
}
