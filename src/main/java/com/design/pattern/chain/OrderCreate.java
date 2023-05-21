package com.design.pattern.chain;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 具体处理者4--订单创建
 */
public class OrderCreate extends Handler{
    @Override
    public void process(OrderInfo order) {
        System.out.println("订单入库");
        //最后一个业务，无需继续执行
    }
}
