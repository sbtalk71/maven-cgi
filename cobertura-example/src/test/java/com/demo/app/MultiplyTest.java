package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyTest {

	
	@Test
	public void testMultiply() {
		Calculator cal= new Calculator();
		assertEquals(20, cal.multiply(4, 5));
	}
}
