package com.hhm.strategy.interfacetype2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略工厂类：如果策略类是无状态的，可以预先创建进行缓存。
 *
 * @Author Ming
 * @Date 2020/8/31 23:05
 * @Version 1.0
 */
public class DiscountStrategyFactory {
    private static final Map<String,IDiscountStrategy> strategys = new ConcurrentHashMap<>();

    static {
        strategys.put(OrderTypeEnum.NORMAL.getDesc(),new NormalDiscountStrategy());
        strategys.put(OrderTypeEnum.GROUPON.getDesc(),new GrouponDiscountStrategy());
        strategys.put(OrderTypeEnum.PROMOTION.getDesc(),new PromotionDiscountStrategy());
    }

    public static IDiscountStrategy getDiscountStrategy(OrderTypeEnum orderTypeEnum){
        return strategys.get(orderTypeEnum.getDesc());
    }
}
