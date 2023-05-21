package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 咖啡的顶层接口--抽象产品
 */
public interface Coffee {
    // 获取名字的方法
    String getName();

    //添加牛奶的方法
    void addMilk();

    //加糖的方法
    void addSugar();

}
