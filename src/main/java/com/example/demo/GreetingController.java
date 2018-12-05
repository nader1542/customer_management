package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/greeting")
	public Greeting getEntity(){
		return new Greeting(1, "Hello World");
	}

}
