package com.games.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {

    // Mapping for the Sign Up page
    @GetMapping("/Signup")
    public String signup() {
        return "Signup";  // Ensure your HTML file is named Signup.html
    }

    // POST method for handling Sign Up form submission
    @PostMapping("/signup")
    public String handleSignup(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("email") String email,
                               @RequestParam("password") String password,
                               @RequestParam("confirmPassword") String confirmPassword,
                               Model model) {
        // You can add logic to save the user details or validate the form
        if (password.equals(confirmPassword)) {
            // Save the user to the database (or further processing)
            model.addAttribute("firstName", firstName);
            return "SignupSuccess";  // This would be your success page after signup
        } else {
            return "SignupFailure";  // This would be a failure page if signup fails
        }
    }
}
