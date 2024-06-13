package com.henry.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class logger2 {
    @Before("com.henry.aop.logger.pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before~~~~~~~"  + joinPoint.getSignature().toString());
    }

}
