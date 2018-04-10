package com.jinhe.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/sayhi")
	@ResponseBody
	public TestBean test(){
		return new TestBean("hey");
	}
	
	class TestBean{
		String msg;

		public TestBean(String msg) {
			super();
			this.msg = msg;
		}
		
	}
}
