package com.training.myapp;

public class ArmstrongRange {
	
	public static int[] armstrong() {
		
		int arr[] = new int[4];
		int j=0;
		for(int i=100;i<=999;i++) {
			int m = i;
			int r=0,a=0;
		
		while(m>0) {
			r=m%10;
			a=a+(r*r*r);
			m=m/10;
		}
		if(i==a)
		{
			
			arr[j]=i;
			j=j+1;
			//j=j-1;
		}
		}
		
		System.out.println(arr);
		return arr;
	}

}
