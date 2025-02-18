package com.dcc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.dcc.services.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http, UserService userService) throws Exception {
                http
                                .authorizeHttpRequests(requests -> requests
                                                .requestMatchers(
                                                                AntPathRequestMatcher.antMatcher("/h2-console/**"),
                                                                AntPathRequestMatcher.antMatcher("/"),
                                                                AntPathRequestMatcher.antMatcher("/home"),
                                                                AntPathRequestMatcher.antMatcher("/register"),
                                                                AntPathRequestMatcher.antMatcher("/login"),
                                                                AntPathRequestMatcher.antMatcher("/error"),
                                                                AntPathRequestMatcher.antMatcher("/ajuda"))
                                                .permitAll()
                                                .requestMatchers(AntPathRequestMatcher.antMatcher("/users/**"))
                                                .authenticated()
                                                .anyRequest().authenticated())
                                .formLogin(form -> form
                                                .loginPage("/login")
                                                .loginProcessingUrl("/login")
                                                .defaultSuccessUrl("/users", true)
                                                .failureUrl("/login?error")
                                                .permitAll())
                                .logout(logout -> logout
                                                .logoutSuccessUrl("/login?logout")
                                                .permitAll())
                                .csrf(csrf -> csrf.disable());

                return http.build();
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder();
        }

        @Bean
        public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
                return authConfig.getAuthenticationManager();
        }
}