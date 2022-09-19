package com.eastern.pattern.sigleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author chensheng13
 * @Description TODO cas实现单例
 * @Date 2022/9/19 10:28
 * @Version 1.0
 */
public class CasSingleton {
    // 写屏障，避免多线程下修改，对其他现场不可见
    private volatile AtomicReference<CasSingleton> atomicSingleton;

    /**
     * 私有化构造方法
     */
    private CasSingleton(){};

    /**
     *
     * @return
     */
    public CasSingleton getInstance() {
        while (true) {
            CasSingleton singleton = atomicSingleton.get();
            if (singleton == null) {
                atomicSingleton.compareAndSet(null, new CasSingleton());
            } else {
                return atomicSingleton.get();
            }
        }
    }
}
