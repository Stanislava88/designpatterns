package com.clouway.factory_method;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        WindowFactory windowFactory = new WindowFactory();
        Window window = windowFactory.getWindow("wooden", "brown");
        System.out.println(window);

        DoorFactory doorFactory = new DoorFactory();
        Door door = doorFactory.getDoor("wooden", "brown");
        System.out.println(door.getColor());

        FloorFactory floorFactory = new FloorFactory();
        Floor floor = floorFactory.getFloor("Laminate");
        floor.getColor();

        Floor floor1 = floorFactory.getFloor("wooden");
        floor1.getColor();
    }
}
