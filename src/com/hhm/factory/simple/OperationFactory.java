package com.hhm.factory.simple;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:25
 */
public class OperationFactory {
    public static Operation createOperation(OperationTypeEnum type){
        Operation operation = null;
        switch (type){
            case ADD:
                operation = new OperationAdd();
                break;
            case SUB:
                operation = new OperationSub();
                break;
            default:
                throw new RuntimeException("type is error. type : "+type);
        }
        return operation;
    }
}
