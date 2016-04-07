package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        HousePartFactory windowFactory = AbstractFactory.getFactory("window");
        assert windowFactory != null;
        HousePartFactory doorFactory = AbstractFactory.getFactory("door");
        assert doorFactory != null;
        HousePartFactory floorFactory = AbstractFactory.getFactory("floor");
        assert floorFactory != null;

        Window window = windowFactory.getWindow("wooden", "white", 100);
        System.out.println(window);

        Door door = doorFactory.getDoor("wooden", "brown", 200);
        System.out.println(door);

        Floor floor = floorFactory.getFloor("laminate", "brown", 300);
        System.out.println(floor);
    }
}
