package com.training.myapp;

public class Discount {
	//Substracts discount from existing price and return new price
	public static double calculate(double newItem) {
		double discount = newItem *35/100;
		double newItemPrice = newItem-discount;
		return newItemPrice;
	}

}
