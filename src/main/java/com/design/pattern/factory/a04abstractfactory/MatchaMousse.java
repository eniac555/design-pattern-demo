package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 抹茶慕斯--具体产品
 */
public class MatchaMousse implements Dessert{
    @Override
    public String getName() {
        return "MatchaMousse";
    }

    @Override
    public void show() {
        System.out.println("抹茶慕斯来喽~");
    }
}
