package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSquare {
	@Test
	public void testSquareOfSuppliedValue() {
		assertEquals(25, SquareNumber.square(5));
	}

}
