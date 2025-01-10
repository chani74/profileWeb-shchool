package com.gyojincompany.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String root() {
		return "index";
	}
	
	
	@GetMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	
}
