package com.hhm.factory.method;

/**
 * 工厂方法模式：简单工厂模式的延伸
 *
 * 主要优点：
 *       （1）隐藏实现细节；
 *       （2）基于工厂角色和产品角色的多态性设计；
 *       （3）新增产品时，无须修改抽象工厂和抽象产品提供的接口，无须修改客户端，只需要新增一个具体工厂和具体产品；
 *
 * 主要缺点：
 *       （1）系统中类的个数增加
 *
 * 适用场景：
 *       （1）客户端不知道它锁需要的对象的类。
 *       （2）抽象工厂类通过其子类来指定创建哪个对象。
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class FactoryMethodClient {

    public static void main(String[] args) {

        ILoggerFactory factory = new FileILoggerFactory();
        ILogger fileLogger = factory.createILogger();
        fileLogger.writeLog();
    }
}
