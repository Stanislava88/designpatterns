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
    public void bought(String productName, int quantity) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                product.bought(quantity);
                System.out.println("After bought new quantity for product " + product.getProductName() + " is " + product.getQuantity());
            } else System.out.println("New product is added " + productName + "q:" + quantity);
        }
    }

    @Override
    public void sell(String productName, int quantity) {

    }
}