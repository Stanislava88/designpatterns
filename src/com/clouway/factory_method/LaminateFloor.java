package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class LaminateFloor implements Floor {

    @Override
    public void getColor() {
        System.out.println("The color pf laminate floor is brown");
    }
}
