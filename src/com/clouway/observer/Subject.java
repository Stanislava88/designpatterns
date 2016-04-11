package com.clouway.observer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public interface Subject {
    void registerObserver(Observer observer);

    void notifyObservers() throws InstantiationException, IllegalAccessException;
}
