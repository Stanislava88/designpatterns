package com.clouway.abstractfactory;

/**
 * The implementation of this interface will be used to get color to door
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public interface Door {
    /**
     * Will return color for the door
     *
     * @return color
     */
    String getColor();

    /**
     * Will return price for the door
     *
     * @return price
     */
    double getPrice();
}
