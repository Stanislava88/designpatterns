package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FloorFactory extends HousePartFactory {
    private String type1 = "laminate";
    private String type2 = "wooden";

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
        if (type.equalsIgnoreCase(type1)) {
            return new LaminateFloor(color, price);

        } else if (type.equalsIgnoreCase(type2)) {
            return new WoodenFloor(color, price);
        }
        return null;
    }
}
