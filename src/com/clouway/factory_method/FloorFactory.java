package com.clouway.factory_method;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FloorFactory {
    public Floor getFloor(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Floor floor = null;
        if (type.equalsIgnoreCase("laminate")) {
            try {
                Constructor constructor = LaminateFloor.class.getConstructor();
                floor = (LaminateFloor) constructor.newInstance();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return floor;
        } else if (type.equalsIgnoreCase("wooden")) {
            try {
                Constructor constructor = WoodenFloor.class.getConstructor();
                floor = (WoodenFloor) constructor.newInstance();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return floor;
        }
        return null;
    }
}
