package com.te.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		List<Object> phone = Arrays.asList(new Products("Samsung", "White", 14558.90, "Ram - 4gb, 64gb Storage", 10),
				new Products("One+", "Black", 28900, "8gb Ram, 128gb Storage", 20),
				new Products("Apple", "Grey", 54000, "6gb Ram, 64gb Storage", 15),
				new Products("Oppo", "Black", 28990, "Ram 8gb, 128gb storage", 30));

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to show all the Items");
		System.out.println("Press 2 to Search for an item");
		try {
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Products.searchProduct();
			break;

		case 2:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Please enter the mobile which you want!!");
			String s = sc1.nextLine();
			switch (s) {
			case "Oneplus":
				System.out.println(phone.get(1));
				System.out.println("Press 1 to buy the product");
				System.out.println("Press 2 to search again");
				System.out.println("Press 3 to go back to last menu");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Products.buyProduct();
					System.out.println("Thanks for Buying this Product!!");
					break;
				case 2:
					Products.searchProduct();
					break;

				}
				break;

			case "Samsung":
				System.out.println(phone.get(0));
				System.out.println("Press 1 to buy the product");
				System.out.println("Press 2 to search again");
				System.out.println("Press 3 to go back to last menu");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Products.buyProduct();
					System.out.println("Thanks for Buying this Product!!");
					break;
				case 2:
					Products.searchProduct();
					break;

				}
				break;

			case "Apple":
				System.out.println(phone.get(2));
				System.out.println("Press 1 to buy the product");
				System.out.println("Press 2 to search again");
				System.out.println("Press 3 to go back to last menu");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Products.buyProduct();
					System.out.println("Thanks for Buying this Product!!");
					break;
				case 2:
					Products.searchProduct();
					break;

				}
				break;

			case "Oppo":
				System.out.println(phone.get(3));
				System.out.println("Press 1 to buy the product");
				System.out.println("Press 2 to search again");
				System.out.println("Press 3 to go back to last menu");
				n = sc.nextInt();
				switch (n) {
				case 1:
					Products.buyProduct();
					System.out.println("Thanks for Buying this Product!!");
					break;
				case 2:
					Products.searchProduct();
					break;

				}
				break;

			default: {
				System.out.println("Product you want is not availaible wait for restock!!");
				break;
			}

			}
		default: {
			System.out.println("PLease Enter valid Inpute");
			break;
		}

		}
		}catch(Exception e) {
			System.out.println("Enter Valid inpute");
		}
		
	}

}
