package org.cccs.dtd.domain;

import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

/**
 * Created by boycook on 04/02/2014.
 */
public class TestDomainObjects {


    @Test
    public void defaultConstructorShouldWork() {
        Movie movie = new Movie();
        assertThat(movie.getName(), is(equalTo(null)));
        assertThat(movie.getDescription(), is(equalTo(null)));
    }

    @Test
    public void settersShouldWorkForEmptyObject() {
        Movie movie = new Movie();
        movie.setName("name1");
        movie.setDescription("description1");
        assertThat(movie.getName(), is(equalTo("name1")));
        assertThat(movie.getDescription(), is(equalTo("description1")));
    }

    @Test
    public void settersShouldWork() {
        Movie movie = new Movie();
        movie.setName("name1");
        movie.setDescription("description1");
        assertThat(movie.getName(), is(equalTo("name1")));
        assertThat(movie.getDescription(), is(equalTo("description1")));
    }
}
