package com.hhm.observer;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/6 22:49
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
