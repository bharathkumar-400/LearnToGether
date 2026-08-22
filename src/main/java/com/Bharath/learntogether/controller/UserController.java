package com.Bharath.learntogether.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bharath.learntogether.dto.LoginRequest;
import com.Bharath.learntogether.dto.UserResponse;
import com.Bharath.learntogether.entity.User;
import com.Bharath.learntogether.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public User registerUser(@Valid @RequestBody User user) {
		
		return userService.registerUser(user);
	
	}
	@PostMapping("login")
	public User loginUser(@Valid @RequestBody LoginRequest loginRequest) {
		return userService.login(loginRequest.getEmail(),loginRequest.getPassword());
	}
	
	@GetMapping("/{id}")
	public UserResponse getUserById(@PathVariable Long id) {
	    return userService.getUserById(id);
	}
	
	

}
