package com.clouway.pool;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class NoFreeResourceException extends RuntimeException {
    public NoFreeResourceException(String msg) {
        super(msg);
    }
}
