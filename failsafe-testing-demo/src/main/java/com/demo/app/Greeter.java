package com.demo.app;

public class Greeter {

	MessageService messageService;

	public Greeter(MessageService ms) {
		this.messageService = ms;
	}

	public String printGreeting(String type) {
		switch (type) {
		case "hello":
			return messageService.sayHello();
		// break;
		case "bye":
			return messageService.sayBye();
		// break;
		case "evening":
			return messageService.goodEvening();
		// break;
		case "morning":
			return messageService.goodMorning();
		// break;
		default:
			return "sorry No message";
		// break;
		}
	}
}
