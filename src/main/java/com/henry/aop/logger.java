package com.henry.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logger {

    @Pointcut("execution(public com.henry.utils.Session com.henry.utils.SqlUtil.getSession(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before!!!!"  + joinPoint.getSignature().toString());
    }

//    @After("pointCut()")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("After!!!!"  + joinPoint.getSignature().toString());
//    }
//
//    @AfterReturning(value = "pointCut()")
//    public void afterReturning(JoinPoint joinPoint) {
//        System.out.println("AfterReturning!!!!");
//    }
//
//    @AfterThrowing(value = "pointCut()")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println("AfterThrowing!!!!");
//    }
//
//    @Around(value = "pointCut()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("Before!!!!");
//        Object retVal = pjp.proceed();
//        System.out.println("After!!!!");
//        return retVal;
//    }
}
