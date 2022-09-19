package com.eastern.pattern.builder;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/19 14:03
 * @Version 1.0
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
