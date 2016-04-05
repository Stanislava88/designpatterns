package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class AluminiumWindow implements Window {
    private String color;

    public AluminiumWindow(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "AluminiumWindow{" +
                "color='" + color + '\'' +
                '}';
    }
}
