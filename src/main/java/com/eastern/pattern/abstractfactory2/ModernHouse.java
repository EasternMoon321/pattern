package com.eastern.pattern.abstractfactory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:39
 * @Version 1.0
 */
public class ModernHouse implements House {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
