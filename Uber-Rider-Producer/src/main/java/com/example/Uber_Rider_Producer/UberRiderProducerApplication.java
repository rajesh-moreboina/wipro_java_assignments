package com.example.Uber_Rider_Producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberRiderProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UberRiderProducerApplication.class, args);
    }
}

/* 

creating:-
-----------
Postman Post: http://localhost:8080/rides

{
"operation": "CREATE",
"id": 1,
"driverName": "Prabha",
"passengerName": "Rajesh",
"pickupLocation": "College",
"dropLocation": "Home",
"fare": 250.0
}

{
"operation": "CREATE",
"id": 2,
"driverName": "Hari",
"passengerName": "Mani",
"pickupLocation": "hyberabad",
"dropLocation": "airport",
"fare": 520.5
}
{
"operation": "CREATE",
"id": 3,
"driverName": "Venky",
"passengerName": "Raghava",
"pickupLocation": "Home",
"dropLocation": "center",
"fare": 150.75
}

Ride created and sent to Kafka

Update:-
-------
PUT:- http://localhost:8080/rides/3

{
"operation": "UPDATE",
"id": 3,
"driverName": "Yashawanth",
"passengerName": "Raghava",
"pickupLocation": "Home",
"dropLocation": "Street",
"fare": 100.50
}
*/