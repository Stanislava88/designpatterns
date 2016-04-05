package com.clouway.abstractfactory;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory winFactory = FactoryProducer.getFactory("window");
        assert winFactory != null;
        AbstractFactory doorFactory = FactoryProducer.getFactory("door");
        assert doorFactory != null;
        AbstractFactory floorFactory = FactoryProducer.getFactory("floor");
        assert floorFactory != null;

        Window window = winFactory.getWindow("wooden", "white", 100);
        System.out.println(window);

        Door door = doorFactory.getDoor("wooden", "brown", 200);
        System.out.println(door);

        Door door1 = doorFactory.getDoor("aluminium", "white", 150);
        System.out.println(door1);

        Floor floor = floorFactory.getFloor("laminate", "brown", 1000);
        System.out.println(floor);
    }
}
