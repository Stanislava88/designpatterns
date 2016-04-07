package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FloorFactory {
    public Floor getFloor(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (type.equalsIgnoreCase("laminate")) {

            //todo: here i have implementations of this pattern using reflection
            return LaminateFloor.class.newInstance();
        }
        return null;
    }
}
