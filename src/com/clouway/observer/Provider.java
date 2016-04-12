package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Provider implements Observer {
    private List<Product> products = new ArrayList<Product>();

    public Provider(List<Product> products) {
        this.products = products;
    }

    @Override
    public void bought(Product product, int quantity) {
        if (!products.contains(product)) {

            products.add(product);
            System.out.println("New product is added " + product.getProductName());

        } else product.bought(quantity);

        System.out.println("After bought new quantity for product " + product.getProductName() + " is " + product.getQuantity());
    }

    @Override
    public void sell(Product product, int quantity) {

    }
}