package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Seller implements Observer {
    private List<Product> products = new ArrayList<Product>();

    public Seller(List<Product> products) {
        this.products = products;
    }

    @Override
    public void sell(Product product, int quantity) {
        if (!products.contains(product)) {
            System.out.println("This product is not available");

        } else product.sell(quantity);
        System.out.println("After sell new quantity for product " + product.getProductName() + " is " + product.getQuantity());
    }

    @Override
    public void bought(Product product, int quantity) {

    }
}

