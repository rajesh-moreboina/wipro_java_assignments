package com.example.Eureka_Restaurant_Producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRestaurantProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRestaurantProducerApplication.class, args);
    }

}
