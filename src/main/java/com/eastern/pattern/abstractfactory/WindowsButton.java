package com.eastern.pattern.abstractfactory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:23
 * @Version 1.0
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
