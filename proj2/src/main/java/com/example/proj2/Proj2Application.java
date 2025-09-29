package com.example.proj2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;

@SpringBootApplication
public class Proj2Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj2Application.class, args);
		Student std=new Student();
	}

}
