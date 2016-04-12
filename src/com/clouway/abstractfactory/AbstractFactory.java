package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class AbstractFactory {
    public static HousePartFactory getFactory(String choose) {
        if (choose.equalsIgnoreCase("window")) {
            return new WindowFactory();

        } else if (choose.equalsIgnoreCase("door")) {
            return new DoorFactory();

        } else if (choose.equalsIgnoreCase("floor")) {
            return new FloorFactory();
        }
        return null;
    }
}

