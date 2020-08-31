package com.hhm.strategy.interfacetype2;

/**
 * 定义策略
 *
 * @Author Ming
 * @Date 2020/8/31 23:03
 * @Version 1.0
 */
public interface IDiscountStrategy {
    Double calDiscount(Order order);
}
