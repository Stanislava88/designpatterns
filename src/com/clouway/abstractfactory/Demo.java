package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory winFactory = FactoryProducer.getFactory("window");
        assert winFactory != null;
        Window window = winFactory.getWindow("wooden", "white", 100);
        Window window1 = winFactory.getWindow("aluminium", "brown", 150);
        System.out.println(window);
        System.out.println(window1);

        AbstractFactory doorFactory = FactoryProducer.getFactory("door");
        assert doorFactory != null;
        Door door = doorFactory.getDoor("wooden", "brown", 200);
        System.out.println(door);
        Door door1 = doorFactory.getDoor("aluminium", "white", 150);
        System.out.println(door1);

        AbstractFactory floorFactory = FactoryProducer.getFactory("floor");
        assert floorFactory != null;
        Floor floor = floorFactory.getFloor("laminate", "brown", 1000);
        System.out.println(floor);
    }
}
