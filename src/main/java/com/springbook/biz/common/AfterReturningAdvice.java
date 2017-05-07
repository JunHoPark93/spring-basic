package com.springbook.biz.common;

import com.springbook.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.h2.engine.User;
import org.springframework.stereotype.Service;

/**
 * Created by Jun Ho Park on 2017-05-04.
 */
@Service
@Aspect
public class AfterReturningAdvice {
    /*@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
    public void getPointcut(){}*/

    @AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
    public void afterLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();

        if(returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            if(user.getRole().equals("Admin")) {
                System.out.println(user.getName()+"로그인(Amdin)");
            }
        }
        System.out.println("[사후 처리]" + method + "() 메소드 리턴 값  :" +returnObj.toString());
    }
}
