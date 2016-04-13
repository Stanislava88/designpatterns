package com.clouway.observer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Product {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity1) {
        this.productName = productName;
        this.quantity = quantity1;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sell(int quantity) {
        this.quantity -= quantity;
    }

    public void bought(int quantity) {
        this.quantity += quantity;
    }
}