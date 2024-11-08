package com.example.taskmanager.taskmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class taskmanagerController {

    @GetMapping("index")
    public String home() {
        return "";
    }

    @GetMapping("/home")
    public String home2() {
        return "home.html";
    }
    
}
