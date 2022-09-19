package com.eastern.pattern.factory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 10:54
 * @Version 1.0
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
