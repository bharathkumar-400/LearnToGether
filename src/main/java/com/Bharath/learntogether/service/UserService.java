package com.Bharath.learntogether.service;

import com.Bharath.learntogether.dto.UserResponse;
import com.Bharath.learntogether.entity.User;

public interface UserService {
	User registerUser(User user);
	User login(String email,String password);
	UserResponse getUserById(Long id);

}
