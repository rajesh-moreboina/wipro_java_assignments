package com.example.Eureka_Restaurant_Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaRestaurantConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRestaurantConsumerApplication.class, args);
    }
}
