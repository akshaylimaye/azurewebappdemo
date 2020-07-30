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
	
	@RequestMapping(method = RequestMethod.GET, value = "/test/test3")
	public String dsiplay2() {
		return "hello world 2nd method!";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/testAzure")
	public String testAzure() {
		return "Azure web app working fine";
	}
}
