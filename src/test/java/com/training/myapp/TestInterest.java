package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestInterest {
	@SuppressWarnings("deprecation")
	@Test
	public void testSimple() {
		assertEquals(120, Interest.simple(2000,3,2),0.02);
	}
	
	@Test
	public void testCompound() {
		assertEquals(12762.81, Interest.compound(10000, 5, 5),0.05);
	}

}
