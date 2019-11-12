package com.training.myapp;

public class Palindrome {
	//It finds whether the given number is palindrome or not
	public static boolean palindrome(int n) {
		int sum=0,r;
		int a = n;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(a==sum)
			return true;
		else return false;
	}

}
