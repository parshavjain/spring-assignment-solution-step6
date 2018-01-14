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
public class LoggingAspectCircle {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectCircle.class);

	// UserCircleController logs

	@Before("execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))")
	public void logBeforeCreateCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))")
	public void logAfterCreateCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))", returning = "result")
	public void logAfterReturningCreateCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))", throwing = "error")
	public void logAfterThrowingCreateCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles())")
	public void logBeforeGetAllCircles(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles())")
	public void logAfterGetAllCircles(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles())", returning = "result")
	public void logAfterReturningGetAllCircles(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles())", throwing = "error")
	public void logAfterThrowingGetAllCircles(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.CircleController.getAllCirclesBasedOnSearchCriteria(..))")
	public void logBeforeGetAllCirclesBasedOnSearchCriteria(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.CircleController.getAllCirclesBasedOnSearchCriteria(..))")
	public void logAfterGetAllCirclesBasedOnSearchCriteria(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.getAllCirclesBasedOnSearchCriteria(..))", returning = "result")
	public void logAfterReturningGetAllCirclesBasedOnSearchCriteria(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.getAllCirclesBasedOnSearchCriteria(..))", throwing = "error")
	public void logAfterThrowingGetAllCirclesBasedOnSearchCriteria(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}
}
