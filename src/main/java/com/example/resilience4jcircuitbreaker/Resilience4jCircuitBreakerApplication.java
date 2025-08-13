package com.example.resilience4jcircuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Resilience4jCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Resilience4jCircuitBreakerApplication.class, args);
	}

}
/*
GET:-  http://localhost:8080/delivery/status

Delivery is on time
*/