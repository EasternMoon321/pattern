package com.eastern.pattern.adapter;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 16:59
 * @Version 1.0
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
