package com.sunboard.springboot.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunboard.springboot.mapper.UserMapper;
import com.sunboard.springboot.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public User login(Map<String, String> map) {
		return userMapper.login(map);
	}
}
