package com.clouway.pool;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        IpPool pool = new IpPool(3);

        IP IP1 = pool.acquire();
        IP IP2 = pool.acquire();
        IP IP3 = pool.acquire();

        System.out.println("Acquire " + IP1);
        System.out.println("Acquire " + IP2);
        System.out.println("Acquire " + IP3);

        pool.release(IP1);
        pool.release(IP2);

        System.out.println("Release " + IP1);
        System.out.println("Release " + IP2);

        System.out.println(pool);
    }
}
