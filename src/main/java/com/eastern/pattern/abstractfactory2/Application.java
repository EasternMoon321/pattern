package com.eastern.pattern.abstractfactory2;


/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:42
 * @Version 1.0
 */
public class Application {
    private Chair chair;
    private Sofa sofa;

    public Application(House house) {
        chair = house.createChair();
        sofa = house.createSofa();
    }

    public void style() {
        chair.style();
        sofa.style();
    }
}
