package com.eastern.pattern.abstractfactory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:22
 * @Version 1.0
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
