package com.hhm.chainpattern.linkmode.v1;

/**
 * @Author Ming
 * @Date 2020/9/1 22:02
 * @Version 1.0
 */
public class ChainApp {

    public static void main(String[] args) {

        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();

    }
}
