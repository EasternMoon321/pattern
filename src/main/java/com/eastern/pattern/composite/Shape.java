package com.eastern.pattern.composite;

import java.awt.*;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 17:38
 * @Version 1.0
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
