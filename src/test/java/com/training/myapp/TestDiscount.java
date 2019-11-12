package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDiscount {
	
	@Test
	public void testSubstractDiscountFromActualPrice() {
		assertEquals(65, Discount.calculate(100),0.02);
	}

}
