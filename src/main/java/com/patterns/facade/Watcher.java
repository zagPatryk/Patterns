package com.patterns.facade;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Aspect
@Component
public class Watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before(value = "execution(* com.patterns.aop.calculator.Calculator.factorial(..))" +
            "&& args(theNumber) && target(object)", argNames = "theNumber,object")
    public void logEvent(BigDecimal theNumber, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + theNumber);
    }

    @Around("execution(* com.patterns.facade.api.OrderFacade.processOrder(..))")
    public void logProcessOrder() {
        LOGGER.info("Process order log");
    }

}
