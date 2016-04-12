package com.clouway.pool;

import java.util.Random;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IP {
    private String ip;
    Random r = new Random();

    public IP() {
        ip = r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);
    }

    @Override
    public String toString() {
        return "IP{" +
                "ip='" + ip + '\'' +
                '}';
    }
}

