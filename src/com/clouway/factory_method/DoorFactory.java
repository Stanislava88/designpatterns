package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DoorFactory {
    private String type1 = "wooden";
    private String type2 = "aluminium";

    public Door getDoor(String type, String color) {
        if (type.equalsIgnoreCase(type1)) {
            return new WoodenDoor(color);
        } else if (type.equalsIgnoreCase(type2)) {
            return new AluminiumDoor(color);
        }
        return null;
    }
}
