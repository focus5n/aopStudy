package org.example.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.aop.util.UtilLib;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class SecurityAop {
    public void displayLine() {
        System.out.println(UtilLib.lpad("-", 50, "-"));
    }

    @Before("execution(public * org.example.aop.entity.Person.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        String signatureStr = joinPoint.getSignature().toString();

        displayLine() ;
        System.out.println("### => 공통코드 실행중");
        System.out.println("### STEP1 : <aop:before> : 메서드 실행 전에 적용되는 어드바이스");
        System.out.println("### STEP1 : " + signatureStr + " 시작전");
        displayLine();
    }

    @Around("execution(public * org.example.aop.entity.Person.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String signatureStr = joinPoint.getSignature().toString();
        displayLine();
        System.out.println("### STEP2 : <aop:around> : 메서드 호출 이전, 이후, 예외 발생 등 모든 시점에 적용 가능한 어드바이스 정의");
        System.out.println("### STEP2 : " + signatureStr + " around 시작.");

        long timeMilli = new Date().getTime();

        try {
            // 핵심기능
            Object result = joinPoint.proceed();
            return result;
        } finally {

            System.out.printf("실행시간 : %d ms%n",new Date().getTime() - timeMilli);
            System.out.println("### STEP2 : " + signatureStr + " around 종료.");
            displayLine();
        }
    }

    @AfterReturning(pointcut = "execution(public * org.example.aop.entity.Person.*(..))", returning = "retVal")
    public void logAfterReturning(JoinPoint joinPoint, Object retVal) {

        String signatureStr = joinPoint.getSignature().toString();
        displayLine();

        System.out.println("### STEP3 : " + "<aop:after-returning> : 메서드가 정상적으로 실행된 후에 적용되는 어드바이스 정의");
        System.out.println("### STEP3 : " + signatureStr + "\n### : 실행 결과 [" + retVal + "]");
        displayLine();
    }

    @AfterThrowing(pointcut = "execution(public * org.example.aop.entity.Person.*(..))", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint ,IllegalArgumentException ex) {

        String signatureStr = joinPoint.getSignature().toString();
        System.out.println("JOIN-POINT : "+signatureStr);
        displayLine();

        System.out.println("### STEP4 : <aop:after-throwing> : 메서드가 예외를 발생시킬 때 적용되는 어드바이스를 정의");
        System.out.println("### STEP4 : 예외발생  => " + ex.toString());
        displayLine();
    }

    @After("execution(public * org.example.aop.entity.Person.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        String signatureStr = joinPoint.getSignature().toString();
        displayLine();

        System.out.println("### STEP5 : <aop:after> : 메서드가 정상적으로 실행되는지 또는 에외를 발생시키는지 여부에 상관없이 실행하는어드바이스를 정의");
        System.out.println("### STEP5 : " + signatureStr + " 종료.");
        displayLine();
    }

}
