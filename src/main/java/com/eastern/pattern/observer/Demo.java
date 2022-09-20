package com.eastern.pattern.observer;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 13:56
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
