package com.hhm.decorator;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 22:09
 */
public class DecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "DecoratorA";
        System.out.println("DecoratorA operation .. addedState:"+addedState);
    }
}
