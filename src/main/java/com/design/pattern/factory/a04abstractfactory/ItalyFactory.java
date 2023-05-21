package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 意大利风味工厂，生产提拉米苏和拿铁咖啡
 */
public class ItalyFactory implements ProductFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
