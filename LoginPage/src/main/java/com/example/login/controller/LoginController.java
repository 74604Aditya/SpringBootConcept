package com.example.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String LoginPage(Model model) {
		
		return "Login";
	}
	
	@PostMapping("/loginsubmit")
	@ResponseBody
	public Map<String,String> login(@RequestBody Map <String,String>logindata){
		String username = logindata.get("username");
		String password = logindata.get("password");
		
		String message;
		if("ADI".equals(username) && "pass123".equals(password)) {
			message = "Welcome," + username + "!";
		}else {
			message = "Invalid username or password!";
		}
		Map<String,String>response = new HashMap<>();
		response.put("message", message);
		return response;//return as JSON
		
	}

}
