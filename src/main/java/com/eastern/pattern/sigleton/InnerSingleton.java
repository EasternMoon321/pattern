package com.eastern.pattern.sigleton;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 10:47
 * @Version 1.0
 */
public class InnerSingleton {
    private InnerSingleton() {}

    // 问题1：属于懒汉式还是饿汉式
    private static class LazyHolder {
        static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    // 问题2：在创建时是否有并发问题
    public static InnerSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
