package com.example.Eureka_Server_Programs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
//http://localhost:8761
/*
--> For Producer
Postman GET:  http://localhost:8081/restaurants

[
{
    "id": 1,
    "name": "The Food Place",
    "location": "New York"
},
{
    "id": 2,
    "name": "Taste Buds",
    "location": "San Francisco"
},
{
    "id": 3,
    "name": "Yummy Corner",
    "location": "Chicago"
}
]
*/
/* -->Consumer
  GET :- http://localhost:8082/consumer/restaurants
  
  [
    {
        "id": 1,
        "name": "The Food Place",
        "location": "New York"
    },
    {
        "id": 2,
        "name": "Taste Buds",
        "location": "San Francisco"
    },
    {
        "id": 3,
        "name": "Yummy Corner",
        "location": "Chicago"
    }
]
  
 */