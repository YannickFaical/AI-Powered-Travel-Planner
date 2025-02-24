package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository;




import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}