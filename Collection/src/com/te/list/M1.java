package com.te.list;

import java.util.Scanner;

public class M1 {
	     public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want");
        int n = sc.nextInt();
        int []a=new int [n];
        System.out.println("enter the elements");
        for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
        System.out.println("Reverse Elements");
        for (int i =a.length-1;i>=0; i--) {
			System.out.println(a[i]);
		}
        
        
    }
}
