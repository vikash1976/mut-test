package com.vikash.rnd.mt.mut_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
	@Test
	public void testIsPositive() {
		CalculatorService calculatorService = new CalculatorService();
        assertTrue(calculatorService.isPositive(10));
	}
	
	@Test
	public void testIsZeroPositive() {
		CalculatorService calculatorService = new CalculatorService();
        assertTrue(calculatorService.isPositive(0));
	}
	@Test
	public void testIsNegative() {
		CalculatorService calculatorService = new CalculatorService();
        assertFalse(calculatorService.isPositive(-1));
	}
}
