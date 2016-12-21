package app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import app.service.PushService;
@Controller
public class SSEController {
	static Logger logger=LoggerFactory.getLogger(SSEController.class);
	@Autowired
	private PushService pushService;
	
	
	
	@RequestMapping("/defer")
	@ResponseBody
	public DeferredResult<String> pushMsg(){
		logger.info("-----------------controller");
		return pushService.getAsyncUpdate();
	}
}
