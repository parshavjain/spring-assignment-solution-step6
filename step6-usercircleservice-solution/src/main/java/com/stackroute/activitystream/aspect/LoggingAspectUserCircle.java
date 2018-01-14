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
public class LoggingAspectUserCircle {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectUserCircle.class);

	// UserCircleController logs

	@Before("execution(* com.stackroute.activitystream.controller.UserCircleController.addToCircle(..))")
	public void logBeforeAddToCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserCircleController.addToCircle(..))")
	public void logAfterAddToCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.addToCircle(..))", returning = "result")
	public void logAfterReturningAddToCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.addToCircle(..))", throwing = "error")
	public void logAfterThrowingAddToCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserCircleController.removeFromCircle(..))")
	public void logBeforeRemoveFromCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserCircleController.removeFromCircle(..))")
	public void logAfterRemoveFromCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.removeFromCircle(..))", returning = "result")
	public void logAfterReturningRemoveFromCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.removeFromCircle(..))", throwing = "error")
	public void logAfterThrowingRemoveFromCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	// UserCircleController logs
	@Before("execution(* com.stackroute.activitystream.controller.UserCircleController.searchByUser(..))")
	public void logBeforeSearchByUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserCircleController.searchByUser(..))")
	public void logAfterSearchByUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.searchByUser(..))", returning = "result")
	public void logAfterReturningSearchByUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.searchByUser(..))", throwing = "error")
	public void logAfterThrowingSearchByUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}
}
