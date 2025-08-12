package com.example.Uber_Rider_Consumer.service;

import com.example.Uber_Rider_Consumer.model.Ride;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final RideService rideService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public KafkaConsumerService(RideService rideService) {
        this.rideService = rideService;
    }

    @KafkaListener(topics = "uber_rides", groupId = "uber_rider_group")
    public void consumeMessage(String message) {
        try {
            JsonNode jsonNode = objectMapper.readTree(message);
            String operation = jsonNode.get("operation").asText();
            Long id = jsonNode.get("id").asLong();

            switch (operation.toUpperCase()) {
                case "CREATE":
                case "UPDATE":
                    Ride ride = new Ride();
                    ride.setId(id);
                    ride.setDriverName(jsonNode.get("driverName").asText());
                    ride.setPassengerName(jsonNode.get("passengerName").asText());
                    ride.setPickupLocation(jsonNode.get("pickupLocation").asText());
                    ride.setDropLocation(jsonNode.get("dropLocation").asText());
                    ride.setFare(jsonNode.get("fare").asDouble());
                    rideService.saveRide(ride);
                    break;

                case "DELETE":
                    rideService.deleteRide(id);
                    break;

                default:
                    System.out.println("Unknown operation: " + operation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
