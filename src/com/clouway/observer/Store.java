package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Store implements Subject {
    private List<Product> products;
    private List<Observer> observers = new ArrayList<Observer>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public void bought(Product product, int quantity) {
        if (!products.contains(product)) {

            products.add(product);

            notifyBought(product, quantity);

        } else product.bought(quantity);

        notifyBought(product, quantity);
    }

    public void sell(Product product, int quantity) throws Exception {
        if (products.contains(product)) {

            product.sell(quantity);

            notifySell(product, quantity);
        }
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyBought(Product product, int quantity) {
        for (Observer observer : observers) {
            observer.bought(product, quantity);
        }
    }

    @Override
    public void notifySell(Product product, int quantity) {
        for (Observer observer : observers) {
            observer.sell(product, quantity);
        }
    }
}