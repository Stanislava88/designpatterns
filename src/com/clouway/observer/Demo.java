package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product("product1", 20);
        Product product2 = new Product("product2", 20);

        List<Product> products = new ArrayList<Product>();
        products.add(product1);

        Store store = new Store(products);
        store.register(new ProductListener());

        store.bought(product1, 2);
        store.sell(product1, 3);
        store.bought(product2, 20);
    }
}
