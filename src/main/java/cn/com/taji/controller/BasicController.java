package cn.com.taji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
	
	@RequestMapping(value="/xyz")
	public String test1() {
		System.out.println("你好");
		return "/hello" ;
	}
}
