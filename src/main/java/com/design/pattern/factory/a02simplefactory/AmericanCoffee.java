package com.design.pattern.factory.a02simplefactory;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description: 美式咖啡--具体产品
 */
public class AmericanCoffee implements Coffee {
    @Override
    public String getName() {
        return "americanCoffee";
    }

    @Override
    public void addMilk() {
        System.out.println("AmericanCoffee...addMilk...");
    }

    @Override
    public void addSugar() {
        System.out.println("AmericanCoffee...addSugar...");
    }
}
