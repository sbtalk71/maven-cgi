package com.demo.app.itest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.demo.app.Greeter;
import com.demo.app.MessageService;

public class EveningIT {

	@Test
	public void testHello() {
		MessageService ms= new MessageService();
		Greeter greeter = new Greeter(ms);
		assertEquals("Good Evening", greeter.printGreeting("evening"));
	}
}
