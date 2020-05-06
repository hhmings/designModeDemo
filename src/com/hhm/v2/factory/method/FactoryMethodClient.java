package com.hhm.v2.factory.method;

/**
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 *
 * 优点：良好的封装性、扩展性、解耦
 *
 *
 * @author houhaimin
 * @version 1.0
 * @date 2020/2/17 22:34
 */
public class FactoryMethodClient {

    public static void main(String[] args) {
        ICreateor createor = new ConcreteCreatetor();
        ConcreteProduct1 concreteProduct1 = createor.createProduct(ConcreteProduct1.class);

        concreteProduct1.desc();

        ConcreteProduct2 concreteProduct2 = createor.createProduct(ConcreteProduct2.class);
        concreteProduct2.desc();
    }
}
