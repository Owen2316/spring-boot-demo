package com.spring.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.spring.demo.controller.UserController.*(..))")
    public void point(){

    }

    @Before("point()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("url={}",request.getRequestURL());

        logger.info("method={}",request.getMethod());

        logger.info("ip={}",request);

        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName(),".",joinPoint.getSignature().getName());

        logger.info("args={}",joinPoint.getArgs());
    }

    @After("point()")
    public void after(){
        logger.info("after");
    }

    @AfterReturning(returning = "object",pointcut = "point()")
    public void afterReturning(Object object){
        logger.info("response={}",object);
    }
}
