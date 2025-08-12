package com.example.Uber_Rider_Producer.service;

import com.example.Uber_Rider_Producer.model.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    private static final String TOPIC = "uber_rides";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendRide(Ride ride) {
        kafkaTemplate.send(TOPIC, ride);
        System.out.println("🚕 Ride sent to Kafka: " + ride.getOperation() + " - " + ride.getId());
    }
}
