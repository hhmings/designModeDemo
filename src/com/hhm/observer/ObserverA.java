package com.hhm.observer;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/6 22:58
 */
public class ObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("[ObserverA] update ...");
    }
}
