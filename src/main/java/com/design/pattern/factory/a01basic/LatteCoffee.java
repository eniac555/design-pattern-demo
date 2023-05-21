package com.design.pattern.factory.a01basic;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description: 拿铁咖啡
 */
public class LatteCoffee implements Coffee {

    @Override
    public String getName() {
        return "latteCoffee";
    }

    @Override
    public void addMilk() {
        System.out.println("LatteCoffee...addMilk...");
    }

    @Override
    public void addSugar() {
        System.out.println("LatteCoffee...addSugar...");
    }
}
