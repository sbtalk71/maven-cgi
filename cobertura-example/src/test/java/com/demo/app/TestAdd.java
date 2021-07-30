package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAdd {

	
	//@Test
	public void testAdd() {
		Calculator cal= new Calculator();
		assertEquals(8, cal.add(4, 4));
	}
}
