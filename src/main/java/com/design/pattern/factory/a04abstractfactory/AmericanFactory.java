package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 美国风味工厂，生产美式咖啡和抹茶慕斯
 */
public class AmericanFactory implements ProductFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
