package com.te.list;

import java.util.Scanner;

public class Mock {
	int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the elements");
		int a[]= new int[5];
		int n = sc.nextInt();
		
		//int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp = a[i];
				if (j < i) {
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
