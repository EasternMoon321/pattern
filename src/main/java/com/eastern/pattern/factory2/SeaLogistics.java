package com.eastern.pattern.factory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:13
 * @Version 1.0
 */
public class SeaLogistics extends Logistics{
    @Override
    public Transport transport() {
        return new Ship();
    }
}
