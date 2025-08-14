package com.example.Eureka_Restaurant_Consumer.controller;

import com.example.Eureka_Restaurant_Consumer.client.RestaurantProducerClient;
import com.example.Eureka_Restaurant_Consumer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    private final RestaurantProducerClient restaurantProducerClient;

    public ConsumerController(RestaurantProducerClient restaurantProducerClient) {
        this.restaurantProducerClient = restaurantProducerClient;
    }

    @GetMapping("/consumer/restaurants")
    public List<Restaurant> getRestaurantsFromProducer() {
        return restaurantProducerClient.getRestaurants();
    }
}
