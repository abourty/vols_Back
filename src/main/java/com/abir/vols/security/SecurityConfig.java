package com.abir.vols.security;
//import java.util.Arrays;
//import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;

//import jakarta.servlet.http.HttpServletRequest;


@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	
		http.csrf().disable()
		 .sessionManagement()
		 .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		 

			 
		 .authorizeHttpRequests()
		 .anyRequest().permitAll()

		
	        // Consulter tous les excursions
	        .requestMatchers("/api/all/**").hasAnyAuthority("ADMIN", "USER")
	        
	        // Consulter une excursion par son id
	        .requestMatchers(HttpMethod.GET, "/api/getbyid/**").hasAnyAuthority("ADMIN", "USER")
	        
	        // Ajouter une nouvelle excursion
	        .requestMatchers(HttpMethod.POST, "/api/addvo/**").hasAnyAuthority("ADMIN")
	        
	        // Modifier une excursion
	        .requestMatchers(HttpMethod.PUT, "/api/updatevo/**").hasAuthority("ADMIN")
	        
	        // Supprimer une excursion
	        .requestMatchers(HttpMethod.DELETE, "/api/delvo/**").hasAuthority("ADMIN")
	        .requestMatchers("/pil/**").hasAnyAuthority("ADMIN","USER")
	        .anyRequest().authenticated()
	        .and()
	        .addFilterBefore(new JWTAuthorizationFilter(), BasicAuthenticationFilter.class);

	    return http.build();
	}

	
	
}