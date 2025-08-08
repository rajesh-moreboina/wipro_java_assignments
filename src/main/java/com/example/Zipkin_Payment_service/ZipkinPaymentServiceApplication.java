package com.example.Zipkin_Payment_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinPaymentServiceApplication.class, args);
	}

}

/*
 Get:   http://localhost:8082/payment
Payment processed successfully.

http://localhost:9411
*/