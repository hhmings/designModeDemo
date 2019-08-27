package com.hhm.strategy;

/**
 * 上下文
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:49
 */
public class OrderStrategyContext {

    private AbstractOrderStrategy orderStrategy;

    public OrderStrategyContext(AbstractOrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    public void process(OrderDTO orderDTO){
        this.orderStrategy.process(orderDTO);
    }
}
