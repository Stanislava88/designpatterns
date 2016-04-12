package com.clouway.pool;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IpPool {
    private List<IP> available = new ArrayList<IP>();
    private List<IP> inUse = new ArrayList<IP>();
    private int maxSize;

    public IpPool(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized IP acquire() throws Exception {
        int size = available.size();

        if (size != 0) {

            for (int i = 0; i < available.size(); i++) {
                IP instance = available.get(i);

                available.remove(instance);

                inUse.add(instance);
                return instance;
            }
        } else if (size + inUse.size() < maxSize) {

            IP po = new IP();
            inUse.add(po);
            return po;
        }
        throw new NoFreeResourceException("Don't have free resource");
    }

    public synchronized void release(IP instance) {
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
