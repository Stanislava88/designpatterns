package com.clouway.abstractfactory;

/**
 * The implementation of this interface will be used to get floor information
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public interface Floor {
    /**
     * Will return color for floor
     *
     * @return color
     */
    String getColor();

    /**
     * Will return price for floor
     *
     * @return price
     */
    double getPrice();
}
