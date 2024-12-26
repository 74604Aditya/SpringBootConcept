package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    
    @GetMapping("/register")
    public String registerPage(Model model) {
        return "Register";
    }
}
