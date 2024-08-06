package com.blessings.authors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorsApplication.class, args);
		System.out.println("author service");
	}

}
