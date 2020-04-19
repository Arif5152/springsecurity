package com.arif.springsecurity.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@GetMapping("/")
	public String sayHello()
	{
		return ("<H1>Hello</H1>");
	}
	
}
