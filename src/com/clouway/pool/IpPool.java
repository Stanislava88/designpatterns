package com.clouway.pool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IpPool {
    private Queue<IP> ips;
    private final Integer maxNum;
    private int acquired = 0;

    public IpPool(Integer maxNum) {
        ips = new LinkedList<IP>();

        for (int i = 0; i < maxNum; i++) {
            ips.add(new IP());
        }
        this.maxNum = maxNum;
    }

    public IP acquire() {
        if (maxNum > acquired) {

            acquired++;

            return ips.poll();
        } else
            throw new NoFreeResourceException();
    }

    public void release(IP ip) {
        if (acquired < maxNum) {
            ips.add(ip);
        }
    }

    @Override
    public String toString() {
        return "Available: " + ips.size();
    }
}
