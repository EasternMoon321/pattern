package com.eastern.pattern.decorators;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 23:54
 * @Version 1.0
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrapper;

    DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }


    @Override
    public void writeData(String data) {
        wrapper.writeData(data);

    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
