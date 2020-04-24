package com.kk.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Controller
public class MyController2 {
	
	Date date = new java.util.Date();
	String SseEmitter = "sdfasdfs";
	String ssString = "sdfasdf";
	Integer asss = Integer.valueOf(4);
	@RequestMapping("/a")
	@ResponseBody
	public String mm() {
		Integer aa = Integer.valueOf(34);
		System.out.println("sdfasdfas");
		return "aaa";
	}
	Integer a = Integer.valueOf(3);
	
	
}
