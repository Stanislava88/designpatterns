package com.clouway.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SingleObjectEqualityTest {
    @Test
    public void equals() throws Exception {
        SingleObject singleObject1 = SingleObject.getInstance();
        SingleObject singleObject2 = SingleObject.getInstance();

        assertThat(singleObject1,is(singleObject2));
    }
}