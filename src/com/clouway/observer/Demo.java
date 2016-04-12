package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Product product1 = new Product("product1", 20);
        Product product2 = new Product("product2", 20);

        List<Product> products = new ArrayList<Product>();
        products.add(product1);

        Store store = new Store();
        store.register(new Provider(products));
        store.register(new Seller(products));

        store.notifyByBought(product1, 2);
        store.notifyBySell(product1, 3);
        store.notifyByBought(product2, 20);
    }
}
