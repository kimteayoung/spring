package com.kty.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	
	@Controller
	public class HomeController {
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String index() {	
			return "index";
		}
	

}
