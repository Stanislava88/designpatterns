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
    public void update(String productName, int quantity) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                product.sell(quantity);
                System.out.println("Update product: " + product.getProductName() + " Quantity after sell is: " + product.getQuantity());
            } else System.out.println("This product is not available");
        }
    }
}

