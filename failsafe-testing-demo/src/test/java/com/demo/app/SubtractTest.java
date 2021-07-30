package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtractTest {

	
	@Test
	public void testSubtract() {
		Calculator cal= new Calculator();
		assertEquals(9, cal.subtract(14, 5));
	}
	
	@Test
	public void testAnotherSubtract() {
		Calculator cal= new Calculator();
		assertEquals(4, cal.subtract(9, 5));
	}
}
