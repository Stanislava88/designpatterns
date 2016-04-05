package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WoodenFloor implements Floor {
    @Override
    public void getColor() {
        System.out.println("From wooden floor");
    }
}
