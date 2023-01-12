package com.codewithshivendra.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
	
	private UserDto user;

}
