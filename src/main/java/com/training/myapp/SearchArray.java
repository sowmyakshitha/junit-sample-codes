package com.training.myapp;

public class SearchArray {
	//It searches whether the number is present in array or not
	public static boolean search(int n) {
		int a[] = {3,2,1,4,5,6,8,12,32,21,45,55,42,113,14};
		int l=a.length;
		for(int i=0;i<l;i++) {
			if(n==a[i]) 
				return true;
			
		}
		return false;
	}
	
}
