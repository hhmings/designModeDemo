package com.hhm.strategy;

/**
 * 取消订单
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:47
 */
public class CancelOrderStrategy extends AbstractOrderStrategy {

    @Override
    public void process(OrderDTO orderDTO) {
        System.out.println("CancelOrderStrategy process ...");
        System.out.println(orderDTO.toString());
    }
}
