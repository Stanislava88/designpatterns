package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Store implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private Adder adder;
    private Seller seller;
    private Product product;

    public Store(Adder adder, Seller seller, Product product) {
        this.adder = adder;
        this.seller = seller;
        this.product = product;
    }

    public void bought(String productName, int quantity) {
        adder.update(productName, quantity);
    }

    public void sell(String productName, int quantity) {
        seller.update(productName, quantity);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(product.getProductName(), product.getQuantity());
        }
    }
}
