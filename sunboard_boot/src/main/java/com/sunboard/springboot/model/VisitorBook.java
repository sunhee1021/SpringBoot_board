package com.sunboard.springboot.model;

import lombok.Data;

@Data
public class VisitorBook {
	
	private int postno;
	private String userid;
	private String address;
	private String content;
	private String companion;
	private String visitdate;
}
