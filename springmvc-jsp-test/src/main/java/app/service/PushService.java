package app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;
@Service
public class PushService {
	Logger logger=LoggerFactory.getLogger(PushService.class);
	private DeferredResult<String> defResult;
	/**
	 * 
	 * @return
	 */
	public DeferredResult<String> getAsyncUpdate(){
		logger.info("-------------service");
		defResult=new DeferredResult<String>();
		return defResult;
	}
	/**
	 * 定时任务
	 */
	@Scheduled(fixedDelay=5000)
	public void refresh(){
		if(defResult != null){
			defResult.setResult(new Long(System.currentTimeMillis()).toString() );
		}
	}
}
