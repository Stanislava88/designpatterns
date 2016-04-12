package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Store implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyBySell(String productName, int quantity) {
        for (Observer observer : observers) {
            observer.sell(productName, quantity);
        }
    }

    @Override
    public void notifyByBought(String productName, int quantity) {
        for (Observer observer : observers) {
            observer.bought(productName, quantity);
        }
    }
}