package com.clouway.observer;

/**
 * The implementation of this interface will be used for observe
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
interface Observer {
    /**
     * @param product  the purchased product
     * @param quantity the quantity of the purchased product
     */
    void bought(Product product, int quantity);

    /**
     * @param product  the sold product
     * @param quantity the quantity of the sold product
     */

    void sell(Product product, int quantity);
}

