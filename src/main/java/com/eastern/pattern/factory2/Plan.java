package com.eastern.pattern.factory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:15
 * @Version 1.0
 */
public class Plan implements Transport {
    @Override
    public void deliver() {
        System.out.println("plan deliver");
    }
}
