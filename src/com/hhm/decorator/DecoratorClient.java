package com.hhm.decorator;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 22:12
 */
public class DecoratorClient {
    public static void main(String[] args) {

        ConcreteComponent component = new ConcreteComponent();
        DecoratorA decoratorA = new DecoratorA();
        DecoratorB decoratorB = new DecoratorB();
        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();

    }
}
