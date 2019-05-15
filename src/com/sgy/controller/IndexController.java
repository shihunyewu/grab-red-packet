package com.sgy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class IndexController {
	@RequestMapping("/index")
	public String grapRedPacket(){
		return "index";
	}
}
