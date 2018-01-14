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
public class LoggingAspectMessageService {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectMessageService.class);

	// UserCircleServiceImpl logs
	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromCircle(..))")
	public void logBeforeGetMessagesFromCircle(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromCircle(..))")
	public void logAfterGetMessagesFromCircle(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromCircle(..))", returning = "result")
	public void logAfterReturningGetMessagesFromCircle(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromCircle(..))", throwing = "error")
	public void logAfterThrowingGetMessagesFromCircle(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromUser(..))")
	public void logBeforeGetMessagesFromUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromUser(..))")
	public void logAfterGetMessagesFromUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromUser(..))", returning = "result")
	public void logAfterReturningGetMessagesFromUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.getMessagesFromUser(..))", throwing = "error")
	public void logAfterThrowingGetMessagesFromUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToCircle(..))")
	public void logBeforeSendMessageToCircle(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToCircle(..))")
	public void logAfterSendMessageToCircle(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToCircle(..))", returning = "result")
	public void logAfterReturningSendMessageToCircle(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToCircle(..))", throwing = "error")
	public void logAfterThrowingSendMessageToCircle(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToUser(..))")
	public void logBeforeSendMessageToUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToUser(..))")
	public void logAfterSendMessageToUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToUser(..))", returning = "result")
	public void logAfterReturningSendMessageToUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.sendMessageToUser(..))", throwing = "error")
	public void logAfterThrowingSendMessageToUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.listTags())")
	public void logBeforeListTags(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.listTags())")
	public void logAfterListTags(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.listTags())", returning = "result")
	public void logAfterReturningListTags(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.listTags())", throwing = "error")
	public void logAfterThrowingListTags(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.showMessagesWithTag(..))")
	public void logBeforeShowMessagesWithTag(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.showMessagesWithTag(..))")
	public void logAfterShowMessagesWithTag(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.showMessagesWithTag(..))", returning = "result")
	public void logAfterReturningShowMessagesWithTag(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.showMessagesWithTag(..))", throwing = "error")
	public void logAfterThrowingShowMessagesWithTag(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageServiceImpl.subscribeUserToTag(..))")
	public void logBeforeSubscribeUserToTag(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageServiceImpl.subscribeUserToTag(..))")
	public void logAfterSubscribeUserToTag(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.subscribeUserToTag(..))", returning = "result")
	public void logAfterReturningSubscribeUserToTag(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageServiceImpl.subscribeUserToTag(..))", throwing = "error")
	public void logAfterThrowingSubscribeUserToTag(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
}
