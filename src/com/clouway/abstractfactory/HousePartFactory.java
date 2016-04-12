package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public abstract class HousePartFactory {
    public abstract Window getWindow(String type, String color, double price);

    public abstract Door getDoor(String type, String color, double price);

    public abstract Floor getFloor(String type, String color, double price);
}
