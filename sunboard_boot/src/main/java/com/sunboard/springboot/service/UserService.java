package com.sunboard.springboot.service;

import java.util.Map;

import com.sunboard.springboot.model.User;

public interface UserService {
	
	public User login(Map<String, String> map);
}
