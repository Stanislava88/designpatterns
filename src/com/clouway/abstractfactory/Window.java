package com.clouway.abstractfactory;

/**
 * The implementation of this interface will be used to get color to window
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
interface Window {
    /**
     * Will return color for this window
     *
     * @return color
     */
    String getColor();

    /**
     * Will return price for this window
     *
     * @return price
     */
    double getPrice();
}
