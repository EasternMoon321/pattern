package com.eastern.pattern.builder;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 15:05
 * @Version 1.0
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
