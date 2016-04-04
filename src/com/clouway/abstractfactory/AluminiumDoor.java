package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class AluminiumDoor implements Door {
    private String color;
    private double price;

    public AluminiumDoor(String color, double price) {
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
        return "AluminiumDoor{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
