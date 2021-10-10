package com.sunboard.springboot.model;

import lombok.Data;

@Data
public class User {
	
	private String userid;
	private String username;
	private String userpwd;
	private String email;
	private String phonenumber;
	private String address;
	private String joindate;
	
}
