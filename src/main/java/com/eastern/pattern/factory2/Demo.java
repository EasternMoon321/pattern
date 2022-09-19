package com.eastern.pattern.factory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:13
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.logistics();

        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.logistics();

        Logistics flyLogistics = new FlyLogistics();
        flyLogistics.logistics();
    }
}
