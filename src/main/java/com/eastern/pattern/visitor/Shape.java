package com.eastern.pattern.visitor;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 15:17
 * @Version 1.0
 */
public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
