package com.example.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/supercars")
public class SupercarController {

    // Serve the HTML page
    @GetMapping
    public String showSupercarsPage() {
        return "supercars"; // Make sure "supercars.html" is in the templates/static folder
    }

    // Optional: Provide car data as JSON
    @GetMapping("/list")
    @ResponseBody
    public List<Map<String, Object>> getSupercarsList() {
        List<Map<String, Object>> cars = new ArrayList<>();

        // Bugatti Chiron
        cars.add(new HashMap<String, Object>() {{
            put("name", "Bugatti Chiron");
            put("topSpeed", "261 mph");
            put("engine", "8.0L Quad-Turbo W16");
            put("price", "$3 million");
            put("description", "One of the fastest cars in the world with a top speed of 261 mph.");
            put("imageUrl", "/images/BugattiChiron.jpeg");
            put("detailsUrl", "https://example.com/bugatti-chiron");
        }});

        // Lamborghini Aventador
        cars.add(new HashMap<String, Object>() {{
            put("name", "Lamborghini Aventador");
            put("topSpeed", "217 mph");
            put("engine", "6.5L V12");
            put("price", "$500,000");
            put("description", "Iconic V12 engine delivering raw power and thrilling performance.");
            put("imageUrl", "/images/FordGT.jpeg");
            put("detailsUrl", "https://example.com/lamborghini-aventador");
        }});

        // Ferrari SF90 Stradale
        cars.add(new HashMap<String, Object>() {{
            put("name", "Ferrari SF90 Stradale");
            put("topSpeed", "211 mph");
            put("engine", "4.0L Twin-Turbo V8 + Electric Motors");
            put("price", "$625,000");
            put("description", "A hybrid beast with over 986 horsepower under the hood.");
            put("imageUrl", "/images/FerrariSF90Stradale.jpeg");
            put("detailsUrl", "https://example.com/ferrari-sf90-stradale");
        }});

        // McLaren P1
        cars.add(new HashMap<String, Object>() {{
            put("name", "McLaren P1");
            put("topSpeed", "217 mph");
            put("engine", "3.8L Twin-Turbo V8 + Electric Motor");
            put("price", "$1.15 million");
            put("description", "Blazing performance paired with futuristic hybrid technology.");
            put("imageUrl", "/images/McLarenP1.jpeg");
            put("detailsUrl", "https://example.com/mclaren-p1");
        }});

        // Porsche 918 Spyder
        cars.add(new HashMap<String, Object>() {{
            put("name", "Porsche 918 Spyder");
            put("topSpeed", "211 mph");
            put("engine", "4.6L V8 + Electric Motors");
            put("price", "$845,000");
            put("description", "An engineering marvel that combines hybrid efficiency and speed.");
            put("imageUrl", "/images/Porsche918Spyder.jpeg");
            put("detailsUrl", "https://example.com/porsche-918-spyder");
        }});

        // Koenigsegg Jesko
        cars.add(new HashMap<String, Object>() {{
            put("name", "Koenigsegg Jesko");
            put("topSpeed", "300 mph (theoretical)");
            put("engine", "5.0L Twin-Turbo V8");
            put("price", "$3 million");
            put("description", "Cutting-edge hypercar pushing boundaries with a 300 mph potential.");
            put("imageUrl", "/images/KoenigseggJesko.jpeg");
            put("detailsUrl", "https://example.com/koenigsegg-jesko");
        }});

        // Pagani Huayra
        cars.add(new HashMap<String, Object>() {{
            put("name", "Pagani Huayra");
            put("topSpeed", "238 mph");
            put("engine", "6.0L Twin-Turbo V12");
            put("price", "$2.6 million");
            put("description", "A luxury supercar with exceptional attention to detail and design.");
            put("imageUrl", "/images/PaganiHuayra.jpeg");
            put("detailsUrl", "https://example.com/pagani-huayra");
        }});

        // Ford GT
        cars.add(new HashMap<String, Object>() {{
            put("name", "Ford GT");
            put("topSpeed", "216 mph");
            put("engine", "3.5L EcoBoost V6");
            put("price", "$500,000");
            put("description", "A modern icon inspired by legendary endurance racing heritage.");
            put("imageUrl", "/images/FordGT.jpeg");
            put("detailsUrl", "https://example.com/ford-gt");
        }});

        // Aston Martin Valkyrie
        cars.add(new HashMap<String, Object>() {{
            put("name", "Aston Martin Valkyrie");
            put("topSpeed", "250 mph");
            put("engine", "6.5L V12 + Electric Motors");
            put("price", "$3 million");
            put("description", "An F1-inspired hypercar built for road and track dominance.");
            put("imageUrl", "/images/AstonMartinValkyrie.jpeg");
            put("detailsUrl", "https://example.com/aston-martin-valkyrie");
        }});

        // Rimac Nevera
        cars.add(new HashMap<String, Object>() {{
            put("name", "Rimac Nevera");
            put("topSpeed", "258 mph");
            put("engine", "Electric Motors (1,914 hp)");
            put("price", "$2.4 million");
            put("description", "An all-electric hypercar boasting jaw-dropping acceleration and speed.");
            put("imageUrl", "/images/RimacNevera.jpeg");
            put("detailsUrl", "https://example.com/rimac-nevera");
        }});

        return cars;
    }
}
