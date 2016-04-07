package com.clouway.factory_method;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WindowFactory {
    public Window getWindow(String type, String color) {
        if (type.equalsIgnoreCase("wooden")) {
            return new WoodenWindow(color);
        }
        return null;
    }
}
