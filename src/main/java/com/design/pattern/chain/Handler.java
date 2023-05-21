package com.design.pattern.chain;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 抽象处理者
 */
public abstract class Handler {

    protected Handler handler;

    public void setNext(Handler handler){
        this.handler = handler;
    }

    //处理过程，由其子类实现
    public abstract void process(OrderInfo order);

}
