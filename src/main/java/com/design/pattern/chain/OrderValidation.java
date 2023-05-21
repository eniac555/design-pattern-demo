package com.design.pattern.chain;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 具体处理者1--检验订单
 */
public class OrderValidation extends Handler{
    @Override
    public void process(OrderInfo order) {
        System.out.println("校验订单基本信息");
        //校验
        handler.process(order);
    }
}
