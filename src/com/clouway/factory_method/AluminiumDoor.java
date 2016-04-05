package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class AluminiumDoor implements Door {
    private String color;

    public AluminiumDoor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "AluminiumDoor{" +
                "color='" + color + '\'' +
                '}';
    }
}
