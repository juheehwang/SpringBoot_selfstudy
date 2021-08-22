package com.example.firstTrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstTrialApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstTrialApplication.class, args);
	}
	@GetMapping
	public String HelloWorld(){
		return "Hello World by Juhee Hwang";
	}
}

