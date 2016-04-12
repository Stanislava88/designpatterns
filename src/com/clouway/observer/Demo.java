package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("car", 10));

        Store store = new Store();
        store.register(new Adder(products));
        store.register(new Seller(products));

        store.notifyByBought("car", 2);
        store.notifyBySell("car", 3);
    }
}
