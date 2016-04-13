package com.clouway.observer;

/**
 * The implementation of this interface will be observe
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
interface Subject {
    /**
     * @param observer object that monitors
     */
    void register(Observer observer);

    /**
     * @param product  product that is purchased
     * @param quantity the quantity of the purchased product
     */
    void notifyBought(Product product, int quantity);

    /**
     * @param product  product that is sold
     * @param quantity sold quantity of product
     */
    void notifySell(Product product, int quantity);
}

