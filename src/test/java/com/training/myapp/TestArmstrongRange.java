package com.training.myapp;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestArmstrongRange {
	@Test
	public void testArmstrongNumbersInBetweenrange() {
		int  actual[]=ArmstrongRange.armstrong();
		int expected[] = {153, 370,371,407};
		assertArrayEquals(expected,actual);
	}

}
