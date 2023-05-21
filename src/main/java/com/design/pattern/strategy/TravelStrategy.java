package com.design.pattern.strategy;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 出行策略接口，具体则有不同的出行策略，如火车飞机等
 */
public interface TravelStrategy {

    //出行方式
    void travel();
}
