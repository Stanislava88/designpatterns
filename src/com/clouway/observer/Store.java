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
    public void notifyBySell(Product product, int quantity) {
        for (Observer observer : observers) {
            observer.sell(product, quantity);
        }
    }

    @Override
    public void notifyByBought(Product product, int quantity) {
        for (Observer observer : observers) {
            observer.bought(product, quantity);
        }
    }
}