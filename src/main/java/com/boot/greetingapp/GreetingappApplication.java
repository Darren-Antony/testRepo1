package com.boot.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GreetingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingappApplication.class, args);
	}

@GetMapping("/home")
	public String welcome() {
		return "welcome to spring boot greeting app";
	}
	
	@GetMapping("/javacourse")
	public String greeting() {
		return "welcome to java course";
	}
	
	@GetMapping("/test")
	public String test() {
		return "welcome to test page";
	}
	@GetMapping("/exit")
	public String bye() {
		return "Thanks a lot see you again";
	}
}
