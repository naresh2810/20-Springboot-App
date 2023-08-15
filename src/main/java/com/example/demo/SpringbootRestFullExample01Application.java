package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootRestFullExample01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootRestFullExample01Application.class, args);
	System.out.println(run);
	    
	
	}

}
