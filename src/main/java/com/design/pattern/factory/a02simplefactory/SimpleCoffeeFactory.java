package com.design.pattern.factory.a02simplefactory;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description: 简单工厂类--具体工厂
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("americano".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
