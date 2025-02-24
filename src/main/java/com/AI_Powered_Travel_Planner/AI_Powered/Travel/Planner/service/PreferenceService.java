package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.service;


import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.Preference;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository.PreferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService {
    private final PreferenceRepository preferenceRepository;

    public PreferenceService(PreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    public Preference savePreference(Preference preference) {
        return preferenceRepository.save(preference);
    }

    public List<Preference> getUserPreferences(Long userId) {
        return preferenceRepository.findByUserId(userId);
    }
}