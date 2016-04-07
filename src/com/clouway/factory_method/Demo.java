package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        WindowFactory windowFactory = new WindowFactory();
        DoorFactory doorFactory = new DoorFactory();
        FloorFactory floorFactory = new FloorFactory();

        Window window = windowFactory.getWindow("wooden", "brown");
        System.out.println(window);

        Door door = doorFactory.getDoor("wooden", "brown");
        System.out.println(door);

        Floor floor = floorFactory.getFloor("Laminate");
        System.out.println(floor.getColor());
    }
}
