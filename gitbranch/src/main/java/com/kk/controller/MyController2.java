package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController2 {
	
	@RequestMapping("/a")
	@ResponseBody
	public String mm() {
		return "aaa";
	}
	Integer a = Integer.valueOf(3);
	
	
}
