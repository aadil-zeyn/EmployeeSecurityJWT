package com.UST.EmployeeSecurityJWT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UST.EmployeeSecurityJWT.entity.AuthRequest;
import com.UST.EmployeeSecurityJWT.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	@GetMapping("/welcome")
	public String welcome() {
		return "hi welcome to ust";
	}
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authrequest) {
		
		return null;
	}
	
	
	
	
	
	
}
