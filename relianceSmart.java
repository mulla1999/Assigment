package com.te.abstraction;

public class relianceSmart implements Reliance {

	@Override
	public void buy() {
		System.out.println("Thanks for Buying this product");

	}

	@Override
	public void sell() {
		System.out.println("Your Product is soldout");

	}

	@Override
	public void emi() {
		System.out.println("Your EMI will start from next month, Please maintain sufficiant balance");

	}

}
