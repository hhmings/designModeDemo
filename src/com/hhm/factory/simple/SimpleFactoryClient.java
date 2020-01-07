package com.hhm.factory.simple;

/**
 * 简单工厂模式：提供了专门的工厂类用于创建对象，将对象的创建和对象的使用分离开。
 *
 * 主要优点：
 *      （1）工厂类包含必要的判断逻辑，可以根据参数决定创建某个产品类的实例；
 *      （2）客户端无须知道锁创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可；
 *
 * 主要缺点：
 *      （1）如果产品类过多，职责过重；
 *      （2）增加系统中类的个数，增加了系统的复杂度和理解难度；
 *      （3）系统扩展困难，添加新的产品类型，需要修改工厂逻辑，违背“开闭原则”；
 *      （4）简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构。
 *
 * 适用场景：工厂类负责创建的对象比较少，工厂方法中的业务逻辑也就不会太过复杂。
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:29
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation(OperationTypeEnum.ADD);
        operation.setNumberA(1D);
        operation.setNumberB(2D);
        System.out.println(operation.getResult());
    }
}
