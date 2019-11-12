package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSearchArray {
	
	
	@Test
	public void testSearchValueInArray() {
		assertEquals(false, SearchArray.search(100));
	}

}
