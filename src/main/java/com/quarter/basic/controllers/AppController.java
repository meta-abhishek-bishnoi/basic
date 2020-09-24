package com.quarter.basic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  @GetMapping("/")
  public String home(){
    return "<h1>Welcome To MetaApp</h1>";
  }
}
