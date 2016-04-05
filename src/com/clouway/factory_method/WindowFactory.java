package com.clouway.factory_method;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class WindowFactory {
    private String type1 = "wooden";
    private String type2 = "aluminium";

    public Window getWindow(String type,String color) {
        if (type.equalsIgnoreCase(type1)) {
            return new WoodenWindow(color);
        } else if (type.equalsIgnoreCase(type2)) {
            return new AluminiumWindow(color);
        }
        return null;
    }
}
