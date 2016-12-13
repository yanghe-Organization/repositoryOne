package app.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmpController {
	static Logger logger=LoggerFactory.getLogger(EmpController.class);
	
	
	
	@RequestMapping("/,index")
	public String index(){
		logger.info("index");
		
		return "index";
	}
}
