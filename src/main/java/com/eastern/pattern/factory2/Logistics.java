package com.eastern.pattern.factory2;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:10
 * @Version 1.0
 */
public abstract class Logistics {

    public void logistics() {
        Transport transport = transport();
        transport.deliver();
    }

    public abstract Transport transport();
}
