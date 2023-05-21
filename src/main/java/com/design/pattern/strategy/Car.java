package com.design.pattern.strategy;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 汽车策略类
 */
public class Car implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("选择汽车出行...");
    }
}
