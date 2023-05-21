package com.design.pattern.chain;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 具体处理者3--金额计算
 */
public class OrderAmountCalculate extends Handler{
    @Override
    public void process(OrderInfo order) {
        System.out.println("计算金额-优惠券、VIP、活动打折");
        handler.process(order);
    }
}
