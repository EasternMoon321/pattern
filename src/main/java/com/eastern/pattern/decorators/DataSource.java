package com.eastern.pattern.decorators;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 23:50
 * @Version 1.0
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
