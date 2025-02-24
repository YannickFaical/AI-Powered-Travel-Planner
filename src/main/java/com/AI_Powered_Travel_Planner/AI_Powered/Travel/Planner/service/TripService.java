package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.service;


import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.Trip;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public List<Trip> getUserTrips(Long userId) {
        return tripRepository.findByUserId(userId);
    }
}