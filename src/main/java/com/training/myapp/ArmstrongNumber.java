package com.training.myapp;

public class ArmstrongNumber {
	//Method finds whether given number is armstrong or not
	public static boolean armstrong(int i) {
		int r,a=0;
		int m = i;
		while(i>0) {
			r=i%10;
			a=a+(r*r*r);
			i=i/10;
		}
		if(m==a)
			return true;
		else 
			return false;
	}

}
