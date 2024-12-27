package com.games.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SigninController {

    // Mapping for the Login (Signin) page
    @GetMapping("/Signin")
    public String login() {
        return "Signin";  // Ensure your HTML file is named Signin.html
    }

    // POST method for handling Login form submission
    @PostMapping("/login")
    public String handleLogin(@RequestParam("username") String username, 
                              @RequestParam("password") String password, 
                              Model model) {
        // You can add authentication logic here
        if (username.equals("user") && password.equals("password")) {  // Example authentication logic
            model.addAttribute("username", username);
            return "LoginSuccess";  // This would be your success page after login
        }
        return "LoginFailure";  // This would be a failure page if login fails
    }
}
