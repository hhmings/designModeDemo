package com.hhm.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/6 22:55
 */
public class WeatherData implements Subject {

    List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }
}
