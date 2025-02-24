package com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.service;



import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.model.User;
import com.AI_Powered_Travel_Planner.AI_Powered.Travel.Planner.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User();
        User user1 =new User();

        user.setUsername("testuser");
        user.setPassword("password");

        user1.setUsername("admin");
        user1.setPassword("admin");



        when(passwordEncoder.encode("password")).thenReturn("encodedPassword");
        when(userRepository.save(user)).thenReturn(user);


        when(passwordEncoder.encode("admin")).thenReturn("encodedPassword");
        when(userRepository.save(user1)).thenReturn(user);

        User savedUser = userService.registerUser(user);
        User savedUser1 = userService.registerUser(user1);

        assertEquals("encodedPassword", savedUser.getPassword());
        verify(userRepository, times(1)).save(user);

        assertEquals("encodedPassword", savedUser1.getPassword());
        verify(userRepository, times(1)).save(user1);
    }
}