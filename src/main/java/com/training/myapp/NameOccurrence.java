package com.training.myapp;

public class NameOccurrence {
	//It counts the number of times word occurrence in a string
	public static int count(String[] a,String name) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==name)
			{
				count += 1;
			}
		}
		if(count !=0) {
		return count;
		}
		else 
			return 0;
	}

}
