package com.example.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AddProductController {
	
	@Controller
	public class ProductController {
		@GetMapping("/addproducts")
	    public String ProductPage() {
	        return "AddProduct";
	    }


    @PostMapping("/addproductjhjgs")
    public ResponseEntity<Map<String, Object>> addProducts
    (@RequestBody Map<String, List<Map<String, Object>>> request) {
        List<Map<String, Object>> products = request.get("product");

        Map<String, Object> response = new HashMap<>();
        if (products == null || products.isEmpty()) {
            response.put("success", false);
            response.put("message", "No products were submitted.");
            return ResponseEntity.badRequest().body(response);
        }

        for (Map<String, Object> product : products) {
            System.out.println("Adding Product: " + product.get("name") + " - Price: " + product.get("price"));
        }

        response.put("success", true);
        response.put("message", products.size() + " products were successfully added.");
        return ResponseEntity.ok(response);
    }
	}
} 