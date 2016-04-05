package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenDoor implements Door {
    private String color;

    public WoodenDoor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "WoodenDoor{" +
                "color='" + color + '\'' +
                '}';
    }
}
