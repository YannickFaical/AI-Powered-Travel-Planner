package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.controller;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.Preference;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.service.PreferenceService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preferences")
public class PreferenceController {
    private final PreferenceService preferenceService;

    public PreferenceController(PreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @PostMapping
    public Preference savePreference(@RequestBody Preference preference) {
        return preferenceService.savePreference(preference);
    }

    @GetMapping("/user/{userId}")
    public List<Preference> getUserPreferences(@PathVariable Long userId) {
        return preferenceService.getUserPreferences(userId);
    }
}