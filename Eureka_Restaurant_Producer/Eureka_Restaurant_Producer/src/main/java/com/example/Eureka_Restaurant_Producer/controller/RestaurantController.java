package com.example.Eureka_Restaurant_Producer.controller;

import com.example.Eureka_Restaurant_Producer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return List.of(
                new Restaurant(1, "The Food Place", "New York"),
                new Restaurant(2, "Taste Buds", "San Francisco"),
                new Restaurant(3, "Yummy Corner", "Chicago")
        );
    }
}
