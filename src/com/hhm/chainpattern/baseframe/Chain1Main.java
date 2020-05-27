package com.hhm.chainpattern.baseframe;


/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/27 23:42
 */
public class Chain1Main {

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        NumberRequest request = new NumberRequest();
        request.setStr("abc");
        Response response = handler1.handleMessage(request);
        System.out.println(response);
    }
}
