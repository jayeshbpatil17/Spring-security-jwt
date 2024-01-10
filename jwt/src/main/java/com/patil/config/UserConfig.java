package com.patil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

	 @Bean
	 public UserDetailsService detailsService() {
		 UserDetails user = User.builder().username("jayesh").password(passwordEncoder().encode("patil")).roles("ADMIN").build();
		 UserDetails user1 = User.builder().username("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();
		 UserDetails user2 = User.builder().username("root").password(passwordEncoder().encode("root")).roles("ADMIN").build();
		 return new InMemoryUserDetailsManager(user,user1,user2);
	 }
	 
	 @Bean
	 public PasswordEncoder  passwordEncoder() {
		 return new BCryptPasswordEncoder();
	 }
	
	 	@Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
	        return builder.getAuthenticationManager();
	    }
}
