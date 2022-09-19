package com.eastern.pattern.abstractfactory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:25
 * @Version 1.0
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
