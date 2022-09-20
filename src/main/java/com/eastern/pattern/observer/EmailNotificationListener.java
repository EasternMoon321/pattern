package com.eastern.pattern.observer;

import java.io.File;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 13:48
 * @Version 1.0
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
