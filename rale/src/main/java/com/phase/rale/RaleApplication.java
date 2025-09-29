package com.phase.rale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class RaleApplication {
	public static void main(String[] args) {
		SpringApplication.run(RaleApplication.class, args);
		System.out.println("inside the application");
	}

}
