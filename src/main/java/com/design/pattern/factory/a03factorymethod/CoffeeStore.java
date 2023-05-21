package com.design.pattern.factory.a03factorymethod;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description:
 */
public class CoffeeStore {
    public static void main(String[] args) {
        //可以根据不同的工厂，创建不同的产品，只需要在这里修改需要的咖啡
        //满足了开闭原则，但是每增加一个产品，就要对应的具体产品和具体产品工厂
        CoffeeStore coffeeStore = new CoffeeStore(new LatteCoffeeFactory());
        Coffee latte = coffeeStore.orderCoffee();
        System.out.println(latte.getName());
    }

    private final CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }


    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        //添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
