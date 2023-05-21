package com.design.pattern.factory.a01basic;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description: 咖啡店类
 */
public class CoffeeStore {
    public static void main(String[] args) {
        Coffee coffee = orderCoffee("latte");
        System.out.println(coffee.getName());
    }

    // 根据类型选择咖啡
    public static Coffee orderCoffee(String type) {
        /*
        所需对象都是通过 new()获得的，耦合比较严重，更换对象后所有new()的地方都有修改，
        违背软件开发的开闭原则--对扩展开放，对修改关闭-----考虑工厂制造对象
         */
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        //添加配料
        assert coffee != null;
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
