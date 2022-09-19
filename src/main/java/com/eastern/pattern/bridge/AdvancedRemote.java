package com.eastern.pattern.bridge;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 17:24
 * @Version 1.0
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
