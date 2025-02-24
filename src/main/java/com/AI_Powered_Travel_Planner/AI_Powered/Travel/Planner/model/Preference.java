package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double budget;
    private String climate;
    private String interests;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}