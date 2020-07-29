package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayTextController {

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String dsiplay() {
		return "hello world!";
	}
}
