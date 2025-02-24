package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.controller;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.Trip;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping
    public Trip saveTrip(@RequestBody Trip trip) {
        return tripService.saveTrip(trip);
    }

    @GetMapping("/user/{userId}")
    public List<Trip> getUserTrips(@PathVariable Long userId) {
        return tripService.getUserTrips(userId);
    }
}