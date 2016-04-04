package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenFloor implements Floor {
    private final String color;
    private final double price;

    public WoodenFloor(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "WoodenFloor{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
