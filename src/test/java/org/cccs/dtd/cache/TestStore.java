package org.cccs.dtd.cache;

import org.cccs.dtd.domain.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by boycook on 04/02/2014.
 */
public class TestStore {

    private Store store;

    @Before
    public void setup() {
        store = new Store();
    }

    @Test
    public void addToCacheShouldWork() {
        assertThat(store.size(), is(0));
        store.addItem(new Movie());
        assertThat(store.size(), is(1));
    }
}
