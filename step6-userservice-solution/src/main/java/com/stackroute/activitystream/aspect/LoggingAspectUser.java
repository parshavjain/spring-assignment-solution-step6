package com.stackroute.activitystream.aspect;

import org.aspectj.lang.annotation.Aspect;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectUser {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectUser.class);

	// UserCircleController logs

	@Before("execution(* com.stackroute.activitystream.controller.UserController.getAllUsers())")
	public void logBeforeGetAllUsers(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.getAllUsers())")
	public void logAfterGetAllUsers(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getAllUsers())", returning = "result")
	public void logAfterReturningGetAllUsers(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getAllUsers())", throwing = "error")
	public void logAfterThrowingGetAllUsers(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserController.getUser(..))")
	public void logBeforeGetUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.getUser(..))")
	public void logAfterGetUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getUser(..))", returning = "result")
	public void logAfterReturningGetUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getUser(..))", throwing = "error")
	public void logAfterThrowingGetUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	// UserCircleController logs
	@Before("execution(* com.stackroute.activitystream.controller.UserController.registerUser(..))")
	public void logBeforeRegisterUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.registerUser(..))")
	public void logAfterRegisterUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.registerUser(..))", returning = "result")
	public void logAfterReturningRegisterUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.registerUser(..))", throwing = "error")
	public void logAfterThrowingRegisterUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))")
	public void logBeforeUpdateUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))")
	public void logAfterUpdateUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))", returning = "result")
	public void logAfterReturningUpdateUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))", throwing = "error")
	public void logAfterThrowingUpdateUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}
}
