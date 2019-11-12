package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPalindrome {
	@Test
	public void testPalindromeWithValidInput() {
		assertEquals(true, Palindrome.palindrome(454));
	}

}
