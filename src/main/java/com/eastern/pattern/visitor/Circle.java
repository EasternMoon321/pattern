package com.eastern.pattern.visitor;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 15:16
 * @Version 1.0
 */
public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
