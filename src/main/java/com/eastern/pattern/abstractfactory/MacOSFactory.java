package com.eastern.pattern.abstractfactory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 11:26
 * @Version 1.0
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
