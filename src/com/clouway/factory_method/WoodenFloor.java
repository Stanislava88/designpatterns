package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenFloor implements Floor {
    private String color;

    public WoodenFloor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "WoodenFloor{" +
                "color='" + color + '\'' +
                '}';
    }
}
