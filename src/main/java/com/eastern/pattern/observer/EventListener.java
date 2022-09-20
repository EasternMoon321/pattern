package com.eastern.pattern.observer;

import java.io.File;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 13:48
 * @Version 1.0
 */
public interface EventListener {
    void update(String eventType, File file);
}
