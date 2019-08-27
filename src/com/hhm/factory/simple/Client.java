package com.hhm.factory.simple;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:29
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation(OperationTypeEnum.ADD);
        operation.setNumberA(1D);
        operation.setNumberB(2D);
        System.out.println(operation.getResult());
    }
}
