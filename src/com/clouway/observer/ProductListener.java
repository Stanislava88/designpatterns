package com.clouway.observer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class ProductListener implements Observer {
    @Override
    public void bought(Product product, int quantity) {
        System.out.println("Bought product " + product.getProductName() + " Current quantity is: " + product.getQuantity());
    }

    @Override
    public void sell(Product product, int quantity) {
        System.out.println("Sell product: " + product.getProductName() + " Current quantity is: " + product.getQuantity());
    }
}
