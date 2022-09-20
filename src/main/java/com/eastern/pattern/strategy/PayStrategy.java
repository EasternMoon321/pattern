package com.eastern.pattern.strategy;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 14:08
 * @Version 1.0
 */

/**
 * Common interface for all strategies.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
