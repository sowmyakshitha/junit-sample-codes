package com.training.myapp;

public class Interest {
	
	//method to find simple interest for given value
	
	public static double simple(double amount,int time,float interest) {
		double i = (amount * time * interest)/100;
		return i;
	}
	//method to find compound interest for given value
	public static double compound(double amount,int time,float interest) {
		
		
		double j = amount * Math.pow(1+interest/100, time);
		return j;
	}
	
	

}
