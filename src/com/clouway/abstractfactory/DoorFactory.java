package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DoorFactory extends HousePartFactory {
    @Override
    public Window getWindow(String type, String color, double price) {
        return null;
    }

    @Override
    public Door getDoor(String type, String color, double price) {
        if (type.equalsIgnoreCase("wooden")) {
            return new WoodenDoor(color, price);
        }
        return null;
    }

    @Override
    public Floor getFloor(String type, String color, double price) {
        return null;
    }
}
