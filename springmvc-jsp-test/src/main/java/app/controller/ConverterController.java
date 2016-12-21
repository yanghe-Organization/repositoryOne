package app.controller;

import javax.validation.ReportAsSingleViolation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.entity.DemoObj;

@Controller
public class ConverterController {
	
	@RequestMapping(value="/convert",produces={"application/x-wisely"})	
	public@ResponseBody DemoObj convert(@RequestBody DemoObj obj){
		
		return obj;
	}
}
