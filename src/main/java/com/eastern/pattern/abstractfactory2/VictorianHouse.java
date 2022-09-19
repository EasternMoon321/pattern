package com.eastern.pattern.abstractfactory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:37
 * @Version 1.0
 */
public class VictorianHouse implements House {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
