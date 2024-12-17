package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for stateless JWT APIs
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/customers/register", "/customers/login").permitAll() // Public endpoints
                .anyRequest().authenticated() // Secure all other endpoints
            )
            .httpBasic(httpBasic -> httpBasic.disable()) // Disable basic auth
            .formLogin(form -> form.disable()); // Disable form login

        return http.build();
    }

   
}
