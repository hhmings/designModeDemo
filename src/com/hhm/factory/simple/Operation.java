package com.hhm.factory.simple;

/**
 * 简单工厂
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:20
 */
public abstract class Operation {
    private Double numberA;
    private Double numberB;

    public abstract Double getResult();

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }
}
