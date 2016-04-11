package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Product product = new Product("apple", 20);
        List<Product> products = new ArrayList<Product>();
        products.add(product);
        Adder adder = new Adder(products);
        Seller seller = new Seller(products);
        Store store = new Store(adder, seller, product);
        store.sell("apple", 5);
        store.bought("apple",20);
        store.bought("apple",20);
        store.bought("banana",30);
        store.notifyObservers();
    }
}
