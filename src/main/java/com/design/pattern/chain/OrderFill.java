package com.design.pattern.chain;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 具体处理者2--订单填充
 */
public class OrderFill extends Handler{
    @Override
    public void process(OrderInfo order) {
        System.out.println("补充订单信息");
        handler.process(order);
    }
}
