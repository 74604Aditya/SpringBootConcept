package com.example.bulb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BulbController {
	
	
	@GetMapping("/Bulb")
	public String BulbPage()
	{
		return "Bulb";
	}

}