package com.example.Uber_Rider_Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberRiderConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UberRiderConsumerApplication.class, args);
    }
}
/*
Postman GET: http://localhost:8082/consumer/rides

[
{
    "id": 1,
    "driverName": "Prabha",
    "passengerName": "Rajesh",
    "pickupLocation": "College",
    "dropLocation": "Home",
    "fare": 250.0
},
{
    "id": 2,
    "driverName": "Prabha",
    "passengerName": "Rajesh",
    "pickupLocation": "College",
    "dropLocation": "Home",
    "fare": 250.0
},
{
    "id": 3,
    "driverName": "Yashawanth",
    "passengerName": "Raghava",
    "pickupLocation": "Home",
    "dropLocation": "Street",
    "fare": 180.5
}
]
*/