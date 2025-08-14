package com.example.Eureka_Restaurant_Consumer.client;

import com.example.Eureka_Restaurant_Consumer.model.Restaurant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "restaurant-producer")
public interface RestaurantProducerClient {
    @GetMapping("/restaurants")
    List<Restaurant> getRestaurants();
}
