package com.clouway.singleton;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return ourInstance;
    }
}
