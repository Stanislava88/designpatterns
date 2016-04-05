package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenWindow implements Window {
    private String color;

    public WoodenWindow(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "WoodenWindow{" +
                "color='" + color + '\'' +
                '}';
    }
}
