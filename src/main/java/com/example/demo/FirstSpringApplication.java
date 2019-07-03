package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;


//@EntityScan( basePackages = {"com.exemple.demo.entities"} )
@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
			
		SpringApplication.run(FirstSpringApplication.class, args);
		
	}
	

}
