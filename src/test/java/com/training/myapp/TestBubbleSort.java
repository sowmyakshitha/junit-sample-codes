package com.training.myapp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBubbleSort {
	@Test
	public void testBubbleSort() {
		int a[] = {4,3,2,5,1};
		
		int b[] = {1,2,3,4,5};
		assertArrayEquals(b, BubbleSort.sort(a));
	}

}
