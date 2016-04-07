package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DoorFactory {
    public Door getDoor(String type, String color) {
        if (type.equalsIgnoreCase("wooden")) {
            return new WoodenDoor(color);
        }
        return null;
    }
}
