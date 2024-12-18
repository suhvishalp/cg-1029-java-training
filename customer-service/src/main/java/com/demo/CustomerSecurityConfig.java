package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CustomerSecurityConfig {

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
	    .authorizeHttpRequests(auth -> auth
	        .requestMatchers("/customers/register", "/customers/login", "/customers/validate-token").permitAll()
	        .anyRequest().authenticated()
	    )
	    .csrf(csrf -> csrf.disable())
	    .httpBasic();
		
		return http.build();
    }
}
