package com.clouway.abstractfactory;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenWindow implements Window {
    private String color;
    private double price;

    public WoodenWindow(String color, double price) {
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
        return "WoodenWindow{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
