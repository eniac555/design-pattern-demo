package com.design.pattern.factory.a03factorymethod;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description: 具体工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
