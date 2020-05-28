package com.hhm.strategy.interfacetype;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/28 8:01
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("BackDoor operate.");
    }
}
