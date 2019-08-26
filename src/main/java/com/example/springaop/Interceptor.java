package com.example.springaop;

import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {
    public boolean before();

    public boolean after();

    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    public void afterReturning();

    public void afterThrowing();

    public boolean userAround();
}