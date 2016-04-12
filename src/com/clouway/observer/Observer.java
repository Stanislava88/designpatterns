package com.clouway.observer;

/**
 * The implementation of this interface will be used for
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
interface Observer {
    void bought(String productName, int quantity);

    void sell(String productName, int quantity);
}

