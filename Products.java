package com.te.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Products {
	private String productName;
	private String productColor;
	private double productCost;
	private String productDescription;
	private int noofItem;

	public Products(String productName, String productColor, double productCost, String productDescription,
			int noofItem) {
		super();
		this.productName = productName;
		this.productColor = productColor;
		this.productCost = productCost;
		this.productDescription = productDescription;
		this.noofItem = noofItem;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductColor() {
		return productColor;
	}

	public double getProductCost() {
		return productCost;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public int getNoofItem() {
		return noofItem;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setNoofItem(int noofItem) {
		this.noofItem = noofItem;
	}

	@Override
	public String toString() {
		return "Products [Product Name = " + productName + ", Product Color = " + productColor + ", Product Cost ="
				+ productCost + ", Product Description = " + productDescription + ", No of Item = " + noofItem + "]";
	}

	public static void buyProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to confirm");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Thanks for Choose this product to buy");
			System.out.println(" ");
			System.out.println("Insert your Card Details");
			Scanner sc9 = new Scanner(System.in);
			System.out.println(" ");
			System.out.print("Enter Debit Card Holder Name: ");
			String s9 = sc9.nextLine();
			System.out.print("Enter Debit Card No: ");
			long l9 = sc9.nextLong();

			Scanner sc8 = new Scanner(System.in);
			System.out.print("Enter Expire Month/Year: ");
			String e9 = sc8.nextLine();
			Scanner sc7 = new Scanner(System.in);
			System.out.print("Enter CVV No: ");
			String c9 = sc8.nextLine();
			System.out.println(" ");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Press 1 to confirm the Payment");
			int n1 = sc1.nextInt();
			switch (n1) {
			case 1:
				System.out.println("Payment Done Successfully!!");
				break;
			default: {
				System.out.println("please Enter valid Input");
				break;
			}
			}

			break;
		}
	}

	public static void searchProduct() {
		List<Object> phone = Arrays.asList(new Products("Samsung", "White", 14558.90, "Ram - 4gb, 64gb Storage", 10),
				new Products("One+", "Black", 28900, "8gb Ram, 128gb Storage", 20),
				new Products("Apple", "Grey", 54000, "6gb Ram, 64gb Storage", 15),
				new Products("Oppo", "Black", 28990, "Ram 8gb, 128gb storage", 30));

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to confirm");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Please find Below Product List " + "\n");
			System.out.println(phone.get(0));
			System.out.println(phone.get(1));
			System.out.println(phone.get(2));
			System.out.println(phone.get(3));
			break;
			default:{
				System.out.println("please Enter valid Input");

			}

		}

	}

}
