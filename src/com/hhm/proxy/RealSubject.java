package com.hhm.proxy;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/28 22:05
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject ... request");
    }
}
