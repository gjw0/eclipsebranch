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
	
	@RequestMapping("/bbbbb")
	@ResponseBody
	public String bbbbb() {
		
		System.out.println("awerssbbbbbbfasfs");
		return "sadfasdbbbbbb";
	}
	
	@RequestMapping("/bsdsdsbbb")
	@ResponseBody
	public String bbbsdsfb() {
		
		System.out.println("awersdfbbbbbbbbfasfs");
		return "sadfasdbbbbbb";
	}
	
	
}
