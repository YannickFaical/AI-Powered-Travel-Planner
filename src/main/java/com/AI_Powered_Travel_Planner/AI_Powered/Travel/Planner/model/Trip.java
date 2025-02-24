package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model;



import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destination;
    private String itinerary;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}