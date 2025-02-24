package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.User;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSignup() throws Exception {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("test@example.com");

        mockMvc.perform(post("/api/auth/signup")
                        .contentType("application/json")
                        .content("{\"username\":\"testuser\",\"password\":\"password\",\"email\":\"test@example.com\"}"))
                .andExpect(status().isOk());
    }
}