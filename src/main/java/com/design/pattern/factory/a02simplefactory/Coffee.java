package com.design.pattern.factory.a02simplefactory;

/**
 * @author eniac555
 * @date 2023/5/20
 * @description: 咖啡接口--抽象产品
 */
public interface Coffee {

    // 获取名字的方法
    String getName();

    //添加牛奶的方法
    void addMilk();

    //加糖的方法
    void addSugar();
}
