package com.design.pattern.strategy;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 策略环境类，用户连接上下文
 */
public class TravelContext {
    private final TravelStrategy travelStrategy;

    public  TravelContext(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;
    }

    public void selectTravel(){
        this.travelStrategy.travel();
    }

    /*

    策略模式的优点：
    策略之间可以自由切换
    易于扩展
    避免使用多条件选择语句，充分体现面向对象设计思想

    缺点：
    客户端必须要知道所有的策略类，并且自己决定使用哪一种策略
    策略模式会产生很多策略类

     */

    //客户端...
    public static void main(String[] args) {
        // TravelContext travelContext = new TravelContext(new Air());
        // TravelContext travelContext = new TravelContext(new Car());
        TravelContext travelContext = new TravelContext(new Train());
        travelContext.selectTravel();
    }
}
