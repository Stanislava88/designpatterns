package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WindowFactory extends HousePartFactory {
    private static String type1 = "wooden";
    private static String type2 = "aluminium";

    @Override
    public Window getWindow(String type, String color, double price) {
        if (type.equalsIgnoreCase(type1)) {
            return new WoodenWindow(color, price);
            
        } else if (type.equalsIgnoreCase(type2)) {
            return new AluminiumWindow(color, price);
        }
        return null;
    }

    @Override
    public Door getDoor(String type, String color, double price) {
        return null;
    }

    @Override
    public Floor getFloor(String type, String color, double price) {
        return null;
    }
}
