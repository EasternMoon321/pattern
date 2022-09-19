package com.eastern.pattern.factory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 10:56
 * @Version 1.0
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
