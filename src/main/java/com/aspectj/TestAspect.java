package com.aspectj;

/**
 * $Revision:  $
 * $Author: shleger $
 * $Date: 08.10.13 10:52  $
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class TestAspect {

//    @Before("execution (* com.aspectj.TestTarget.test*(..))")
@Around(value="execution(@com.aspectj.LogMethod * *(..)) && @annotation(logged)", argNames= "pjp,logged")
    public void advice(ProceedingJoinPoint pjp, LogMethod logged) {
        System.out.printf("TestAspect.AroundAdvice() called on '%s'%n", logged);
    try {
        pjp.proceed();
    } catch (Throwable throwable) {
        throwable.printStackTrace();
    }
}
}