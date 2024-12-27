package com.games.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GamingController {

    // Mapping for the Home Page
    @GetMapping("/home")
    public String home() {
        return "GamingWebsite";
    }

    // Mapping for the Contact Us page
    @GetMapping("/contact")
    public String contact() {
        return "ContactUs";
    }

    // Handling the search query (example of form submission)
    @PostMapping("/search")
    public ModelAndView search(@RequestParam("query") String query) {
        ModelAndView modelAndView = new ModelAndView("SearchResults");
        modelAndView.addObject("query", query);
        // Add logic to handle the search and populate results
        return modelAndView;
    }

    // Mapping for the Games page
    @GetMapping("/games")
    public String games(Model model) {
        // Add logic to retrieve and add games data to the model
        return "Games";
    }

    // Mapping for the Resources page
    @GetMapping("/resources")
    public String resources(Model model) {
        // Add logic to retrieve and add resources data to the model
        return "Resources";
    }

    // Mapping for the About page
    @GetMapping("/about")
    public String about() {
        return "About";
    }
}
