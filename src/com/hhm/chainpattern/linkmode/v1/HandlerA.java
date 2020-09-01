package com.hhm.chainpattern.linkmode.v1;

/**
 * @Author Ming
 * @Date 2020/9/1 21:50
 * @Version 1.0
 */
public class HandlerA extends Handler {
    @Override
    public boolean doHandle() {
        System.out.println("HandlerA succ.");
        return false;
    }
}
