package com.eastern.pattern.bridge;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 17:14
 * @Version 1.0
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
