package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.JwtUtil;
import com.demo.dtos.LoginResponse;
import com.demo.dtos.UserLoginRequest;
import com.demo.dtos.UserRegistrationRequest;
import com.demo.entities.CustomerDetails;
import com.demo.entities.User;
import com.demo.repos.CustomerDetailsRepository;
import com.demo.repos.UserRepository;

@Service
public class UserService {

    private static final String SECRET_KEY = "vZp9Q3R$s0!y6A^f%8U#e!pD7h1z!Zq9";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Register User
    public void registerUser(UserRegistrationRequest request) {
        if (userRepository.existsByUsernameOrEmail(request.getUsername(), request.getEmail())) {
            throw new RuntimeException("Username or Email already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRoles(request.isManager() ? List.of("ROLE_MANAGER") : List.of("ROLE_CUSTOMER"));
        userRepository.save(user);

        CustomerDetails details = new CustomerDetails();
        details.setUser(user);
        details.setFirstName(request.getFirstName());
        details.setLastName(request.getLastName());
        details.setPhoneNumber(request.getPhoneNumber());
        details.setAddress(request.getAddress());
        customerDetailsRepository.save(details);
    }

   

    public LoginResponse login(UserLoginRequest request) {
        // Fetch user by username
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Validate password
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        // Generate JWT token using JwtUtil
        String token = JwtUtil.generateToken(user.getUsername(), user.getRoles());

        // Return login response
        return new LoginResponse(token, user.getUsername(), user.getRoles());
    }

    // Get Customer Details
    public CustomerDetails getCustomerDetails(Long userId) {
        return customerDetailsRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Customer details not found"));
    }
}
