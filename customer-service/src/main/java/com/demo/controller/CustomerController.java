package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dtos.LoginResponse;
import com.demo.dtos.UserDetailsResponse;
import com.demo.dtos.UserLoginRequest;
import com.demo.dtos.UserRegistrationRequest;
import com.demo.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
    private UserService userService;

    // User Registration
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserRegistrationRequest request) {
        try {
            userService.registerUser(request);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("User registered successfully.");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Registration failed: " + e.getMessage());
        }
    }

    // User Login
    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody UserLoginRequest request) {
        try {
            LoginResponse response = userService.login(request);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("Login failed: " + e.getMessage());
        }
    }

    // Fetch Customer Details
    @GetMapping("/{userId}/details")
    public ResponseEntity<?> getCustomerDetails(@PathVariable Long userId, HttpServletRequest request) {
        System.out.println("Authorization Header: " + request.getHeader("Authorization"));

        try {
            UserDetailsResponse userDetails = userService.getCustomerDetails(userId);
            return ResponseEntity.ok(userDetails);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User not found: " + e.getMessage());
        }
    }
    
    
    @GetMapping("/validate-token")
    public ResponseEntity<?> validateToken(@RequestParam String token) {
    	System.out.println("Validating the Token");
        try {
            userService.validateToke(token); // Call the service to validate the token
            return ResponseEntity.ok("Token validated successfully.");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("Token validation failed: " + e.getMessage());
        }
    }
    
    
}
