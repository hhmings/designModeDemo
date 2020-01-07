package com.hhm.decorator;

/**
 * 抽象装饰类
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 22:07
 */
public abstract class Decorator extends Component{
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
