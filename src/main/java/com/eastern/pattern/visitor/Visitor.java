package com.eastern.pattern.visitor;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 15:17
 * @Version 1.0
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
