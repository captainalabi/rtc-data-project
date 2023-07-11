package com.collaboration.rtc.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping({"/homepage"})
	public String homePage() {
		return "homepage";
	}
	@GetMapping({"/"})
	public String index() {
		return "homepage";
	}
	
	@GetMapping("/adminpage")
	public String adminPage() {
		return "adminpage";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
