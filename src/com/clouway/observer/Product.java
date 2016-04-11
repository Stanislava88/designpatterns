package com.clouway.observer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Product  {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        this.quantity -= quantity;
    }

    public void buy(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }
}
