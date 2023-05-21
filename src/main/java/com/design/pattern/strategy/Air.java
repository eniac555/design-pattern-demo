package com.design.pattern.strategy;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 飞机策略类
 */
public class Air implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("选择了飞机出行...");
    }
}
