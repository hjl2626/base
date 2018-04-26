package com.hjl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component("index2")
public class Index {

    @Before("@annotation(Test)")
    public void before(){
        System.out.println("before");
    }
}
