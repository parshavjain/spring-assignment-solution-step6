package com.stackroute.activitystream.aspect;


import org.aspectj.lang.annotation.Aspect;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectCircleService {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectCircleService.class);

	// UserCircleServiceImpl logs
	@Before("execution(* com.stackroute.activitystream.service.CircleServiceImpl.save(..))")
	public void logBeforeSave(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleServiceImpl.save(..))")
	public void logAfterSave(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.save(..))", returning = "result")
	public void logAfterReturningSave(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.save(..))", throwing = "error")
	public void logAfterThrowingSave(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.CircleServiceImpl.delete(..))")
	public void logBeforeDelete(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleServiceImpl.delete(..))")
	public void logAfterDelete(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.delete(..))", returning = "result")
	public void logAfterReturningDelete(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.delete(..))", throwing = "error")
	public void logAfterThrowingDelete(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.CircleServiceImpl.get(..))")
	public void logBeforeGet(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleServiceImpl.get(..))")
	public void logAfterGet(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.get(..))", returning = "result")
	public void logAfterReturningGet(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.get(..))", throwing = "error")
	public void logAfterThrowingGet(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.service.CircleServiceImpl.getAllCircles())")
	public void logBeforeGetAllCircles(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleServiceImpl.getAllCircles())")
	public void logAfterGetAllCircles(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.getAllCircles())", returning = "result")
	public void logAfterReturningGetAllCircles(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleServiceImpl.getAllCircles())", throwing = "error")
	public void logAfterThrowingGetAllCircles(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
}
