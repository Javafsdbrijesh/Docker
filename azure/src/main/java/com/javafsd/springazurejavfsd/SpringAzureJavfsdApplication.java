package com.javafsd.springazurejavfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureJavfsdApplication {

	@GetMapping("/azure")
	public String message() {
		return " Congratulations ! we have deployed our application on Azure Successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureJavfsdApplication.class, args);
	}

}
