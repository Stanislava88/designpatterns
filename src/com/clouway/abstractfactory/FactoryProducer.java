package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FactoryProducer {
    private static String factory1 = "window";
    private static String factory2 = "door";
    private static String factory3 = "floor";

    public static AbstractFactory getFactory(String choose) {
        if (choose.equalsIgnoreCase(factory1)) {
            return new WindowFactory();
        } else if (choose.equalsIgnoreCase(factory2)) {
            return new DoorFactory();
        } else if (choose.equalsIgnoreCase(factory3)) {
            return new FloorFactory();
        }
        return null;
    }
}
