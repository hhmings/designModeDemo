package com.hhm.strategy.interfacetype2;

/**
 * 具体策略
 *
 * @Author Ming
 * @Date 2020/8/31 23:04
 * @Version 1.0
 */
public class PromotionDiscountStrategy implements IDiscountStrategy {
    @Override
    public Double calDiscount(Order order) {
        return null;
    }
}
