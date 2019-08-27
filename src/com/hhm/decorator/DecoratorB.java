package com.hhm.decorator;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 22:11
 */
public class DecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        show();
        System.out.println("DecoratorB ... operation");
    }

    private void show(){
        System.out.println("DecoratorB ... show");
    }
}
