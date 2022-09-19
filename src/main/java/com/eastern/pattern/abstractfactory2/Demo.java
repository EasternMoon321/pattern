package com.eastern.pattern.abstractfactory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:40
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        House house = new ModernHouse();
        Application application = new Application(house);
        application.style();
    }
}
