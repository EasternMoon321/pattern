package com.eastern.pattern.abstractfactory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:24
 * @Version 1.0
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
