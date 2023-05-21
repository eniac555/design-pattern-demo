package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 咖啡店
 */
public class CoffeeStore {
    public static void main(String[] args) {
        //还是通过不同的store进行生产，new ItalyFactory()就会自动进行提拉米苏和拿铁咖啡的order
        CoffeeStore store = new CoffeeStore(new ItalyFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
        System.out.println("=================");
        Dessert dessert = store.orderDessert();
        System.out.println(dessert.getName());
    }

    private final ProductFactory productFactory;

    public CoffeeStore(ProductFactory productFactory){
        this.productFactory = productFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = productFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }


    public Dessert orderDessert(){
        Dessert dessert = productFactory.createDessert();
        dessert.show();
        return dessert;
    }
}
