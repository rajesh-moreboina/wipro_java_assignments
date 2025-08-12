package com.example.Uber_Rider_Producer.controller;

import com.example.Uber_Rider_Producer.model.Ride;
import com.example.Uber_Rider_Producer.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping
    public String createRide(@RequestBody Ride ride) {
        ride.setOperation("CREATE");
        rideService.sendRide(ride);
        return "Ride created and sent to Kafka";
    }

    @PutMapping("/{id}")
    public String updateRide(@PathVariable Long id, @RequestBody Ride ride) {
        ride.setId(id);
        ride.setOperation("UPDATE");
        rideService.sendRide(ride);
        return "Ride updated and sent to Kafka";
    }

    @DeleteMapping("/{id}")
    public String deleteRide(@PathVariable Long id) {
        Ride ride = new Ride();
        ride.setId(id);
        ride.setOperation("DELETE");
        rideService.sendRide(ride);
        return "Ride deleted and sent to Kafka";
    }
}
