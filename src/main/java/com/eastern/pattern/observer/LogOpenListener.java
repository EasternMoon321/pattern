package com.eastern.pattern.observer;

import java.io.File;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 13:50
 * @Version 1.0
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
