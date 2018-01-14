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
public class LoggingAspectUserService {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectUserService.class);

	// UserCircleServiceImpl logs
	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.save(..))")
	public void logBeforeSave(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.save(..))")
	public void logAfterSave(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.save(..))", returning = "result")
	public void logAfterReturningSave(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.save(..))", throwing = "error")
	public void logAfterThrowingSave(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.update(..))")
	public void logBeforeUpdate(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.update(..))")
	public void logAfterUpdate(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.update(..))", returning = "result")
	public void logAfterReturningUpdate(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.update(..))", throwing = "error")
	public void logAfterThrowingUpdate(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.delete(..))")
	public void logBeforeDelete(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.delete(..))")
	public void logAfterDelete(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.delete(..))", returning = "result")
	public void logAfterReturningDelete(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.delete(..))", throwing = "error")
	public void logAfterThrowingDelete(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.get(..))")
	public void logBeforeGet(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.get(..))")
	public void logAfterGet(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.get(..))", returning = "result")
	public void logAfterReturningGet(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.get(..))", throwing = "error")
	public void logAfterThrowingGet(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.list())")
	public void logBeforeList(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.list())")
	public void logAfterList(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.list())", returning = "result")
	public void logAfterReturningList(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.list())", throwing = "error")
	public void logAfterThrowingList(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.validate(..))")
	public void logBeforeValidate(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.validate(..))")
	public void logAfterValidate(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.validate(..))", returning = "result")
	public void logAfterReturningValidate(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.validate(..))", throwing = "error")
	public void logAfterThrowingValidate(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserServiceImpl.exists(..))")
	public void logBeforeExists(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserServiceImpl.exists(..))")
	public void logAfterExists(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.exists(..))", returning = "result")
	public void logAfterReturningExists(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserServiceImpl.exists(..))", throwing = "error")
	public void logAfterThrowingExists(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
}
