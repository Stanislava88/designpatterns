package com.clouway.singleton.pool;

import com.clouway.pool.IP;
import com.clouway.pool.IpPool;
import com.clouway.pool.NoFreeResourceException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IpPoolTest {
    @Test
    public void happyPath() throws Exception {
        IpPool ipPool = new IpPool(5);

        String actual = ipPool.toString();
        String expected = "Available: 5";

        assertThat(actual, is(expected));
    }

    @Test
    public void acquire() throws Exception {
        IpPool ipPool = new IpPool(2);

        ipPool.acquire();

        String actual = ipPool.toString();
        String expected = "Available: 1";

        assertThat(actual, is(expected));
    }

    @Test
    public void release() throws Exception {
        IpPool ipPool = new IpPool(2);

        IP ip = ipPool.acquire();
        ipPool.release(ip);

        String actual = ipPool.toString();
        String expected = "Available: 2";

        assertThat(actual, is(expected));
    }

    @Test(expected = NoFreeResourceException.class)
    public void acquireNoFreeResource() throws Exception {
        IpPool ipPool = new IpPool(1);

        ipPool.acquire();
        ipPool.acquire();
    }
}
