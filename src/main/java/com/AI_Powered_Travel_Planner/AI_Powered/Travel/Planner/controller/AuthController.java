package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.controller;



import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.User;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userService.registerUser(user);
    }
}