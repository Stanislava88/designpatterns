package com.clouway.pool;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class ObjectPool {
    private List<PooledObject> available = new ArrayList<PooledObject>();
    private List<PooledObject> inUse = new ArrayList<PooledObject>();
    private int maxSize;

    public ObjectPool(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized PooledObject acquire() throws Exception {
        int size = available.size();

        if (size != 0) {

            for (int i = 0; i < available.size(); i++) {
                PooledObject instance = available.get(i);

                available.remove(instance);

                inUse.add(instance);
                return instance;
            }
        } else if (size + inUse.size() < maxSize) {

            PooledObject po = new PooledObject();
            inUse.add(po);
            return po;
        }
        throw new NoFreeResourceException("Don't have free resource");
    }

    public synchronized void release(PooledObject instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    @Override
    public String toString() {
        return "{" +
                "available=" + available +
                ", inUse=" + inUse +
                '}';
    }
}
