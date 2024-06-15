package com.henry.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logger {

    @Pointcut("execution(public com.henry.model.User com.henry.model.User.getUser(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before!!!!" + joinPoint.getSignature().toString());
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After!!!!"  + joinPoint.getSignature().toString());
    }

    @AfterReturning(value = "pointCut()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("AfterReturning!!!!");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("AfterThrowing!!!!");
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        Object result = null;
        try {
            System.out.println("Around:Before!!!!");
            result = pjp.proceed();
            System.out.println("Around:After!!!!");
        } catch (Throwable e) {
            System.out.println("Around:throw!!!!");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Around:finally!!!!");
        }

        return result;
    }
}