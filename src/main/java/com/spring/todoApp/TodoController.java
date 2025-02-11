package com.spring.todoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@GetMapping("/")
	public String Name() {
		return "Hello Ajay";
		
	}
}
