package com.example.resilience4jcircuitbreaker.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryStatusService {

    private static final String CIRCUIT_BREAKER_NAME = "deliveryServiceCircuitBreaker";

    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackDeliveryStatus")
    public String getDeliveryStatus() {
        String url = "http://localhost:8081/delivery/status"; // external API URL
        return restTemplate.getForObject(url, String.class);
    }

    public String fallbackDeliveryStatus(Throwable t) {
        return "Fallback response due to: " + t.getMessage();
    }
}
