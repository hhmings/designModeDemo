package com.hhm.strategy;

/**
 * 策略模式
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:42
 */
public abstract class AbstractOrderStrategy {
    public abstract void process(OrderDTO orderDTO);
}
