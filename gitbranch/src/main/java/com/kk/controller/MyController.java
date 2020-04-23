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
	
	@RequestMapping("/b")
	@ResponseBody
	public String b() {
		System.out.println("bbbbbb");
		return "bbbb";
	}
	
	String a = "sdfas";
	@RequestMapping("/d")
	@ResponseBody
	public String c() {
		String a="sdfs";
		System.out.println("csdsdf");
		return "cerwc";
	}
	
	@RequestMapping("/aserwerwrf")
	@ResponseBody
	public String te6sdd() {
		
		System.out.println("asdfsfss");
		
		return "ssaerwersdfsa";
	}
	
	
}
