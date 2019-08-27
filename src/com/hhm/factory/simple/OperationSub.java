package com.hhm.factory.simple;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:24
 */
public class OperationSub extends Operation {
    @Override
    public Double getResult() {
        return getNumberA()-getNumberB();
    }
}
