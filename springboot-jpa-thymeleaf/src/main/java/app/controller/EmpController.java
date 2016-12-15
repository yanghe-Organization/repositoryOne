package app.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.entity.Employee;
import app.entity.ErrorInfo;
import app.service.EmpService;
import app.service.impl.EmpServiceImpl;


@Controller
public class EmpController {
	static Logger logger=LoggerFactory.getLogger(EmpController.class);
	@Autowired
	private EmpService empService;

	
	@RequestMapping("/index")
	public String index(){
		logger.info("index");
		return "index";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/loginCheck")
	public ModelAndView loginCheck(long empId,String passWord){
		ErrorInfo error=new ErrorInfo();
		Employee emp=empService.loginCheck(error,empId,passWord);
		ModelAndView mav=new ModelAndView();
		if(emp!=null){
			mav.addObject("emp", emp);
			mav.setViewName("index");
			return mav;
		}else {
			error.setMsg("用户不存在！");
			mav.addObject("error",error);
			mav.setViewName("error");
			return mav;
		}
		
	}
	@RequestMapping("/empManage")
	public ModelAndView empManage(){
		List<Employee> empList=empService.empManage();
		ModelAndView mav=new ModelAndView();
		mav.addObject("empList", empList);
		mav.setViewName("empManage");
		return mav;
	}
	@RequestMapping("/registerCheck")
	public String register(Employee emp){
		System.out.println(emp);
		return "login";
	}
	
}
