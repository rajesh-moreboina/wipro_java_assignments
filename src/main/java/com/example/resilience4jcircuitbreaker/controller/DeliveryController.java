package com.example.resilience4jcircuitbreaker.controller;

import com.example.resilience4jcircuitbreaker.service.DeliveryStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
//@RestController
//public class DeliveryController {
//
//    @Autowired
//    private DeliveryStatusService deliveryStatusService;
//
//    @GetMapping("/delivery/status")
//    public String getStatus() {
//        return deliveryStatusService.getDeliveryStatus();
//    }
//}
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @GetMapping("/status")
    public String getStatus() {
        return "Delivery is on time";
    }
}
