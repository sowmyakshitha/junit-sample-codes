package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNameOccurrence {
	
	@Test
	public void testNoOfTimesOccurrenceInArray() {
		
		String[] a= {"cat","rat","sat","cat","bat","cat"};
		assertEquals(3, NameOccurrence.count(a,"cat"));
	}

}
