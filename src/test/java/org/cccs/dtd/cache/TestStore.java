package org.cccs.dtd.cache;

import org.cccs.dtd.domain.Entity;
import org.cccs.dtd.domain.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by boycook on 04/02/2014.
 */
public class TestStore {

    private Store store;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;

    @Before
    public void setup() {
        store = new Store();
        movie1 = new Movie();
        movie2 = new Movie();
        movie3 = new Movie();
    }

    @Test
    public void addToStoreShouldWork() {
        assertThat(store.size(), is(0));
        store.addItem(movie1);
        assertThat(store.size(), is(1));
        store.addItem(movie2);
        assertThat(store.size(), is(2));
        store.addItem(movie3);
        assertThat(store.size(), is(3));
    }

    @Test
    public void removeFromStoreShouldWork() {
        addToStoreShouldWork();
        store.removeItem(movie1.getId());
        assertThat(store.size(), is(2));
        store.removeItem(movie2.getId());
        assertThat(store.size(), is(1));
        store.removeItem(movie3.getId());
        assertThat(store.size(), is(0));
    }

    @Test
    public void getFromStoreShouldWork() {
        addToStoreShouldWork();
        assertThat(store.<Movie>getItem(movie1.getId()), is(equalTo(movie1)));
        assertThat(store.<Movie>getItem(movie2.getId()), is(equalTo(movie2)));
        assertThat(store.<Movie>getItem(movie3.getId()), is(equalTo(movie3)));
    }

}
