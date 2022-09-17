package com.vikash.rnd.mt.mut_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.vikash.rnd.mt.mut_test.Palindrome;

public class PalindromeTest {
	@Test
	public void whenPalindrom_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		assertTrue(palindromeTester.isPalindrome("noon"));
	}

	@Test
	public void whenPalindromWithEmptyString_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		assertTrue(palindromeTester.isPalindrome(""));
	}

//Comment these tests to reveal the value mutation testing brings for you
	@Test
	public void whenNotPalindrom_thanReject() {
		Palindrome palindromeTester = new Palindrome();
		assertFalse(palindromeTester.isPalindrome("box"));
	}

	@Test
	public void whenNearPalindrom_thanReject() {
		Palindrome palindromeTester = new Palindrome();
		assertFalse(palindromeTester.isPalindrome("neon"));
	}

}
