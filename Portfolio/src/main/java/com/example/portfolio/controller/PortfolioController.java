package com.example.portfolio.controller;

import com.example.portfolio.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/portfolio")
    public String getPortfolio(Model model) {
        // Sample user data
        User user = new User("ADITYA LANDE", "A passionate developer", "adityalande45@gmail.com", "123-456-7890");
        
        // Add user data to the model
        model.addAttribute("user", user);
        
        return "portfolio";
    }
}
