package com.eastern.pattern.factory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:12
 * @Version 1.0
 */
public class RoadLogistics extends Logistics{
    @Override
    public Transport transport() {
        return new Truck();
    }
}
