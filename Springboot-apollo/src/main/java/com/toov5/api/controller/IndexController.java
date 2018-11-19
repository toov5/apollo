package com.toov5.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
   
	@Value("${toov5-test:ins}")  //默认值test 读不到的情况下 就是ins
	private String toov5;
	
	@RequestMapping("/getName")
	public String getName() {
		return toov5;
	}
}
