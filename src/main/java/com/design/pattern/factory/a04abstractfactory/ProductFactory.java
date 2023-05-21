package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 顶层的抽象工厂
 */
public interface ProductFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
