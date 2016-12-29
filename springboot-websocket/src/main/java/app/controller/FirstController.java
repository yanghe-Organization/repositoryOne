package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import app.service.FirstService;
@Controller
public class FirstController {
	
	
	private FirstService service;
	
	
//	@RequestMapping("/test")
//	public String test(){
//		System.out.println(service);
//		System.out.println("test");
//		String result=service.doSomething();
//		return result;
//	}
	@RequestMapping("/test")
	public String myHtml(){
		System.out.println(11111111);
		return "test";
	}
	
	
	@RequestMapping("/index")
	public String index(){
		System.out.println("index");
		return "index";
	}
}
