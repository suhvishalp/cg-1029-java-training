package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.JwtUtil;
import com.demo.dtos.LoginResponse;
import com.demo.dtos.UserDetailsResponse;
import com.demo.dtos.UserLoginRequest;
import com.demo.dtos.UserRegistrationRequest;
import com.demo.entities.CustomerDetails;
import com.demo.entities.User;
import com.demo.repos.CustomerDetailsRepository;
import com.demo.repos.UserRepository;

@Service
public class UserService {

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    private JwtUtil jwtUtil;

    // Register User
    public void registerUser(UserRegistrationRequest request) {
        if (userRepository.existsByUsernameOrEmail(request.getUsername(), request.getEmail())) {
            throw new RuntimeException("Username or Email already exists.");
        }

        User user = buildUserEntity(request);
        userRepository.save(user);

        CustomerDetails details = buildCustomerDetailsEntity(request, user);
        customerDetailsRepository.save(details);
    }

    // User Login
    public LoginResponse login(UserLoginRequest request) {
        User user = fetchUserByUsername(request.getUsername());

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid username or password.");
        }

        String token = jwtUtil.generateToken(user.getUsername(), user.getRoles());
        return new LoginResponse(token, user.getUsername(), user.getRoles());
    }

    //validate token
    public void validateToke(String token) {
    	jwtUtil.validateToken(token);
    }
    
    // Get Customer Details
    public UserDetailsResponse getCustomerDetails(Long userId) {
        CustomerDetails details = customerDetailsRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Customer details not found."));

        return new UserDetailsResponse(
                details.getUser().getUsername(),
                details.getFirstName(),
                details.getLastName(),
                details.getPhoneNumber(),
                details.getAddress()
        );
    }

    // Private Helper Methods
    private User buildUserEntity(UserRegistrationRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRoles(determineRoles(request.isManager()));
        return user;
    }

    private CustomerDetails buildCustomerDetailsEntity(UserRegistrationRequest request, User user) {
        CustomerDetails details = new CustomerDetails();
        details.setUser(user);
        details.setFirstName(request.getFirstName());
        details.setLastName(request.getLastName());
        details.setPhoneNumber(request.getPhoneNumber());
        details.setAddress(request.getAddress());
        return details;
    }

    private User fetchUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found with username: " + username));
    }

    private List<String> determineRoles(boolean isManager) {
        return isManager ? List.of("ROLE_MANAGER") : List.of("ROLE_CUSTOMER");
    }
}
