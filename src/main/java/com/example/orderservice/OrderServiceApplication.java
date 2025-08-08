package com.example.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}

/*
Zipkin cmd : java -jar zipkin-server-2.23.2-exec.jar

Zipkin dashboard url : http://localhost:9411

postman Get : http://localhost:8082/order
Order placed successfully. [Payment service unavailable right now]
*/