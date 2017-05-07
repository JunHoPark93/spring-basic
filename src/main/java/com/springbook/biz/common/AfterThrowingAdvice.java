package com.springbook.biz.common;

/**
 * Created by Jun Ho Park on 2017-05-04.
 */
public class AfterThrowingAdvice {
    public void exceptionLog() {
        System.out.println("[예외 처리] 비지니스 로직 수행 중 예외 발생");
    }
}
