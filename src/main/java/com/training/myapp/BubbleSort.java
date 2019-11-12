package com.training.myapp;

public class BubbleSort {
	 //Sorts given array in ascending order
	public static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		
		int n = a.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a);
		return a;
	}
	
	

}
