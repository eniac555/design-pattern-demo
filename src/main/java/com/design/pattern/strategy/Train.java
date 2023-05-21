package com.design.pattern.strategy;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 火车策略类
 */
public class Train implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("选择火车出行...");
    }
}
