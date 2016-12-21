package app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import ch.qos.logback.classic.Logger;
@Controller
@RequestMapping("/first")
public class FirstController {
	
	static Logger logger=(Logger) LoggerFactory.getLogger(FirstController.class);
	@RequestMapping("/test")
	public String test(Model model,View view){
		
		model.addAttribute("msg", "hello");
		logger.info("test");
		
		return null;
	}
	/**
	 * 
	 * @return text文本格式
	 */
	@RequestMapping(value="/case1",produces={"text/pain;charset=utf-8"})
	@ResponseBody
	public String testCase1(){
		return "testCase1";
	}
	
	/**
	 * 不同的访问路径映射到同一个方法
	 * @return json格式
	 */
	@RequestMapping(value={"/case2","/case3"},produces={"application/json;charset=utf-8"})
	@ResponseBody
	public String testCase2(HttpServletRequest request,HttpServletResponse response){
		
		return "testCase2";
	}
	
	
}
