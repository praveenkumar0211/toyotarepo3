package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class DemoController {
	@RequestMapping(value="/")
	public String method1() {
		return("Hi");
	}
	@RequestMapping(value="/Hai")
			public String method21(){
				return("Haaaai");
				
			}
			
	
	
	public String method2() {
		return null;
		
	}
	
}
