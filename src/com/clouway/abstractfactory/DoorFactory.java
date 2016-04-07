package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DoorFactory extends HousePartFactory {
    private String type1 = "wooden";
    private String type2 = "aluminium";

    @Override
    public Window getWindow(String type, String color, double price) {
        return null;
    }

    @Override
    public Door getDoor(String type, String color, double price) {
        if (type.equalsIgnoreCase(type1)) {
            return new WoodenDoor(color, price);

        } else if (type.equalsIgnoreCase(type2)) {
            return new AluminiumDoor(color, price);
        }
        return null;
    }

    @Override
    public Floor getFloor(String type, String color, double price) {
        return null;
    }
}
