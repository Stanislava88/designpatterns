package com.clouway.observer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
interface Subject {
    void register(Observer observer);

    void notifyBySell(String productName, int quantity);

    void notifyByBought(String productName, int quantity);
}

