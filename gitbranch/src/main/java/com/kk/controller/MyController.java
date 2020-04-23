package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/a")
	@ResponseBody
	public String a() {
		System.out.println("aaaaa");
		
		return "success";
	}
	
	@RequestMapping("/tsdfsdf")
	@ResponseBody
	public String b() {
		
		System.out.println("sdfasfs");
		return "sadfasdfsa";
	}
	
	
}
