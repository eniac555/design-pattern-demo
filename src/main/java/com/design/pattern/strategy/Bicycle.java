package com.design.pattern.strategy;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 自行车策略类
 */
public class Bicycle implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("选择自行车出行....");
    }
}
