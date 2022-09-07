package com.example.exercises52;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	@Autowired
	public static ConfigurableApplicationContext ex;
	public static void main(String[] args) {ex=SpringApplication.run(Application.class, args);
	}



}
