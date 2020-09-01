package com.hhm.chainpattern.linkmode.v1;

/**
 * @Author Ming
 * @Date 2020/9/1 21:54
 * @Version 1.0
 */
public class HandlerB extends Handler {
    @Override
    public boolean doHandle() {
        System.out.println("HandlerB succ.");
        return true;
    }
}
