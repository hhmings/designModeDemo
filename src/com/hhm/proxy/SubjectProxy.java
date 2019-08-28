package com.hhm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/28 22:06
 */
public class SubjectProxy implements InvocationHandler {
    /** 目标对象 */
    private Object object;

    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("invoke before...");
        result = method.invoke(object,args);
        System.out.println("invoke after...");
        return result;
    }
}
