package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Service
//@Aspect
public class BeforeAdvice {
	
	//@Before("PointcutCommon.getPointcut()")
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();  // 비즈니스 메소드의 이름을 알아내는 방법.
		Object[] args = jp.getArgs();                 // 비즈니스 메소드의 매개변수를 알아내는 방법.
		
		System.out.println("[사전 처리] " + method +"() 메소드, args 정보: " + args[0].toString());
	}
}
