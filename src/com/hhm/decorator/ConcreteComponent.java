package com.hhm.decorator;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 22:07
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation...");
    }
}
