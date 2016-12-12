package app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class LogAspect {
	Logger logger=LoggerFactory.getLogger(LogAspect.class);
	public static void doBefore(JoinPoint jp){
		
	}
}
