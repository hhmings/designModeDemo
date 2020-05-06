package com.hhm.observer;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/6 23:01
 */
public class ObserverMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(new ObserverA());
        weatherData.registerObserver(new ObserverB());

        weatherData.notifyObservers();

    }
}
