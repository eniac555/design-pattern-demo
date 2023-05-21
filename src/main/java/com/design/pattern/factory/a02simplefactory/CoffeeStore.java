package com.design.pattern.factory.a02simplefactory;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description:
 */
public class CoffeeStore {
    public static void main(String[] args) {

        Coffee coffee = orderCoffee("latte");
        System.out.println(coffee.getName());

    }


    /*
    使用简单工厂也不是特别好，还是需要进行简单工厂类的修改
     */
    public static Coffee orderCoffee(String type) {
        //通过工厂获得对象，不需要知道对象实现的细节
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        //添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
