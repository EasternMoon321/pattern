package com.eastern.pattern.observer;

import java.io.File;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 13:55
 * @Version 1.0
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
