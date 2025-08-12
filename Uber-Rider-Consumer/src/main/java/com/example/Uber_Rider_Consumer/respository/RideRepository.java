package com.example.Uber_Rider_Consumer.respository;

import com.example.Uber_Rider_Consumer.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
