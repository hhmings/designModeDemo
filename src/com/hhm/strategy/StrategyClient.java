package com.hhm.strategy;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:51
 */
public class StrategyClient {

    public static void main(String[] args) {
        OrderDTO orderDTO = new OrderDTO(1L);
        OrderStrategyContext context = new OrderStrategyContext(new CancelOrderStrategy());
        context.process(orderDTO);
    }
}
