package com.design.pattern.chain;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 客户类
 */
public class Application {

    /*
    责任链模式优点：
        降低了对象之间的耦合度---请求发送对象和接收对象之间的耦合
        增强了系统可扩展性---新增其他流程依然非常方便，修改客户类就行
        增强了给对象指派职责的灵活性---可以随意修改处理顺序(修改setNext方法的参数)
        简化了对象之间的连接
        责任分组---每个类处理自己的任务

    缺点：
        责任链比较长，请求处理会涉及多个处理对象，影响系统性能
        责任链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于责任链的错误导致系统出错，如造成循环调用

     */

    public static void main(String[] args) {
        //检验订单
        Handler orderValidation = new OrderValidation();
        //补充订单信息
        Handler orderFill = new OrderFill();
        //订单算价
        Handler OrderAmountCalculate = new OrderAmountCalculate();
        //订单落库
        Handler orderCreate = new OrderCreate();

        //设置责任链路
        orderValidation.setNext(orderFill);
        orderFill.setNext(OrderAmountCalculate);
        OrderAmountCalculate.setNext(orderCreate);

        //开始执行
        orderValidation.process(new OrderInfo());
    }
}
