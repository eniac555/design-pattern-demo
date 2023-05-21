package com.design.pattern.factory.a04abstractfactory;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 提拉米苏--具体产品
 */
public class Tiramisu implements Dessert{
    @Override
    public String getName() {
        return "Tiramisu";
    }

    @Override
    public void show() {
        System.out.println("提拉米苏来喽~");
    }
}
