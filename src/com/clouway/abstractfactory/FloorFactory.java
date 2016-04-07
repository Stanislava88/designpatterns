package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FloorFactory extends HousePartFactory {
    @Override
    public Window getWindow(String type, String color, double price) {
        return null;
    }

    @Override
    public Door getDoor(String type, String color, double price) {
        return null;
    }

    @Override
    public Floor getFloor(String type, String color, double price) {
        if (type.equalsIgnoreCase("laminate")) {
            return new LaminateFloor(color, price);
        }
        return null;
    }
}
