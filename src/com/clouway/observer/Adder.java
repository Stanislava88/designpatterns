package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Adder implements Observer {
    private List<Product> products = new ArrayList<Product>();

    public Adder(List<Product> products) {
        this.products = products;
    }

    @Override
    public void update(String productName, int quantity) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                product.buy(quantity);
                System.out.println("Update product: " + product.getProductName() + " Quantity after bought is: " + product.getQuantity());
            } else System.out.println("New product is added: " + productName + " Quantity: " + quantity);
        }
    }
}