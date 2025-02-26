package com.iralik.docker.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Student {
    @GetMapping("/student-list")
    public String getAllStudents(){
      return "Method works implement the development";
    }
}
