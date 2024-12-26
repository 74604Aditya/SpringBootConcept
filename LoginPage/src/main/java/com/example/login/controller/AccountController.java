package com.example.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
	
	@GetMapping("/testData")
	public String TestPage() {
			return "Test";
	}
	@PostMapping("/accountdata")
	@ResponseBody
	public Map<String,String> login(@RequestBody Map <String,String>accdata){
		String firstname = accdata.get("firstname");
		String lastname = accdata.get("lastname");
		String age = accdata.get("age");
		String email = accdata.get("email");
		String phone = accdata.get("phone");
		String password = accdata.get("password");
		
		String message = "Your firstname is " +firstname+ " and lastname is " +lastname+ " ,are stored and account created " 
		+ "successfully with userID" +email;
		
		Map<String,String>response = new HashMap<>();
		response.put("rmsg", message);
		return response;//return as JSON 
	}
}
