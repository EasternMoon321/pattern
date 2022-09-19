package com.eastern.pattern.sigleton;

/**
 * @Author chensheng13
 * @Description TODO syn实现单例
 * @Date 2022/9/19 10:19
 * @Version 1.0
 */
public class SynSingleton {
    private static SynSingleton singleton = null;

    /**
     * 私有化构造方法
     */
    private SynSingleton(){};

    /**
     * 1. 加锁，避免多线程创建多个对象
     * 2. 双检查，避免没错加锁
     * @return
     */
    public SynSingleton getInstance() {
        if (singleton != null) {
            return singleton;
        }
        synchronized (SynSingleton.class) {
            // 必要，避免两个线程都等待加锁，一个线程完成时，另一个还创建
            if (singleton == null) {
                singleton = new SynSingleton();
            }
            return singleton;
        }
    }
}
