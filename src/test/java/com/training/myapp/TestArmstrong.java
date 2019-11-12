package com.training.myapp;
 
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArmstrong {
	@Test
	public void testArmstrongWithPositiveNumbers() {
		assertEquals(true, ArmstrongNumber.armstrong(153));
	}

}
