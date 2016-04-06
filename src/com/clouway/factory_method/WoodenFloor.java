package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenFloor implements Floor {
    @Override
    public String getColor() {
        return "This floor is wooden";
    }
}
