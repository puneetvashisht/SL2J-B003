package springbasic.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(boolean springbasic.services.PaymentService.transferFunds(..))")
	public void doLogging(JoinPoint jp){
		System.out.println("Aspect for Service Logging....");
		Object args[] = jp.getArgs();
		for(Object arg: args) System.out.println(arg);
		
	}

	@Before("execution(* springbasic.repos.*.*(..))")
	public void doLoggingRepos(JoinPoint jp){
		System.out.println("Aspect for Repos Logging....");
		Object args[] = jp.getArgs();
		for(Object arg: args) System.out.println(arg);
		
	}
}
