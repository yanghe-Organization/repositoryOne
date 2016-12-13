package app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
	static Logger logger=LoggerFactory.getLogger(LogAspect.class);
	
	/**
	 * execution(【修饰符】 返回值类型【 包名.类名.】方法名(参数)【异常】)
	 * ..表示所有*表示任意
	 */
	@Pointcut("execution(* app.repository..*(..))")
	public void pointCut(){
		
	}
	
	/**
	 * 	 
	 * @param JoinPoint
	 * 1)JoinPoint 
		 java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表； 
		 Signature getSignature() ：获取连接点的方法签名对象； 
		 java.lang.Object getTarget() ：获取连接点所在的目标对象； 
		 java.lang.Object getThis() ：获取代理对象本身； 
	   2)ProceedingJoinPoint 
		   ProceedingJoinPoint继承JoinPoint子接口，它新增了两个用于执行连接点方法的方法： 
		 java.lang.Object proceed() throws java.lang.Throwable：通过反射执行目标对象的连接点处的方法； 
		 Java.lang.Object proceed(java.lang.Object[] args) throws java.lang.Throwable：通过反射执行目标对象连接点处的方法，不过使用新的入参替换原来的入参。 

	 */
	@Before("pointCut() ")
	public static void doBefore(JoinPoint jp){
		logger.info("-----方法"+jp.getSignature().getName()+"被调用-----");
	}
}
