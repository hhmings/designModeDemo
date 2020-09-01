package com.hhm.chainpattern.arraymode.v1;

/**
 * @Author Ming
 * @Date 2020/9/1 22:13
 * @Version 1.0
 */
public class HandlerD implements IHandler {
    @Override
    public boolean handle() {
        System.out.println("HandlerD succ.");
        return true;
    }
}
