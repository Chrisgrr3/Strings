package com.chris.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is a great tool. It is very easy to create webpages that display strings.";
	}
}
