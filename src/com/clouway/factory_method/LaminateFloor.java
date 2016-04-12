package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class LaminateFloor implements Floor {

    @Override
    public String getColor() {
        return "The color for laminate floor is brown";
    }
}
