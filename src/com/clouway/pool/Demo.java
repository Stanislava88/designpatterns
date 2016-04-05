package com.clouway.pool;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        ObjectPool pool = new ObjectPool(3);

        PooledObject pooledObject1 = pool.acquire();
        PooledObject pooledObject2 = pool.acquire();
        PooledObject pooledObject3 = pool.acquire();

        System.out.println("Acquire " + pooledObject1);
        System.out.println("Acquire " + pooledObject2);
        System.out.println("Acquire " + pooledObject3);

        pool.release(pooledObject1);
        pool.release(pooledObject2);

        System.out.println("Release " + pooledObject1);
        System.out.println("Release " + pooledObject2);

        System.out.println(pool);
    }
}
