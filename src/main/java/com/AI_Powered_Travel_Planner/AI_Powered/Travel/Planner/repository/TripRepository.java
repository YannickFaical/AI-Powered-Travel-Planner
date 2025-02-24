package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByUserId(Long userId);
}