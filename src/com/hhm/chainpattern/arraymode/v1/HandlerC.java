package com.hhm.chainpattern.arraymode.v1;

/**
 * @Author Ming
 * @Date 2020/9/1 22:12
 * @Version 1.0
 */
public class HandlerC implements IHandler {
    @Override
    public boolean handle() {
        System.out.println("HandlerC succ.");
        return true;
    }
}
