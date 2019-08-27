package com.hhm.factory.simple;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:23
 */
public class OperationAdd extends Operation {
    @Override
    public Double getResult() {
        return getNumberA()+getNumberB();
    }
}
