package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DevideTest {

	
	@Test
	public void testDevide() {
		Calculator cal= new Calculator();
		assertEquals(8, cal.devide(32, 4));
	}
}
