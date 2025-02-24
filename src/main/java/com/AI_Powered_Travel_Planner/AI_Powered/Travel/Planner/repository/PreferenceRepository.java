package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository;


import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PreferenceRepository extends JpaRepository<Preference, Long> {
    List<Preference> findByUserId(Long userId);
}
