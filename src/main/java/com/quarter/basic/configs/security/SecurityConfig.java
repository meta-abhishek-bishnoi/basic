package com.quarter.basic.configs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
  * SecurityConfig
  *
  * @author Abhishek Bishnoi
  * 24-Sep-2020, 6:59 PM
*/
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//  @Override
//  public void configure(HttpSecurity http) throws Exception{
//    http.
//        authorizeRequests()
//        .anyRequest().authenticated()
//        .and()
//        .formLogin()
//        .and()
//        .httpBasic();
//  }
  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception{
    auth.inMemoryAuthentication()
        .withUser("user")
        .password("password")
        .roles("USER");
  }
  
  @Bean
  public PasswordEncoder getPasswordEncoder(){
    return NoOpPasswordEncoder.getInstance();
  }
}

