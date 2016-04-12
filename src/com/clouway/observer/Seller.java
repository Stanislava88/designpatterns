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
    public void sell(String productName, int quantity) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                product.sell(quantity);
                System.out.println("After sell new quantity for product " + product.getProductName() + " is " + product.getQuantity());
            } else System.out.println("This product is not available");
        }
    }

    @Override
    public void bought(String productName, int quantity) {

    }
}

