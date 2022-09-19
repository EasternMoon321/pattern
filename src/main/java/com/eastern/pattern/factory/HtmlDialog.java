package com.eastern.pattern.factory;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 10:57
 * @Version 1.0
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
