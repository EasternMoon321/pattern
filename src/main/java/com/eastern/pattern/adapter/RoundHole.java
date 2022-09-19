package com.eastern.pattern.adapter;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 16:57
 * @Version 1.0
 */
public class RoundHole {
    private double radius;
    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
