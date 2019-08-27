package com.hhm.strategy;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 21:43
 */
public class OrderDTO {
    private Long orderId;

    public OrderDTO(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId=" + orderId +
                '}';
    }
}
