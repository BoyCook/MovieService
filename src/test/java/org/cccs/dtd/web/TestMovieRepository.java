package org.cccs.dtd.web;

import org.cccs.dtd.domain.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TestMovieRepository {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private MovieRepository repository;

    @Test
    public void whenFindByName_thenReturnMovie() {
        // given
        Movie movie = new Movie("Star Wars IV", "A New Hope");
        entityManager.persist(movie);
        entityManager.flush();

        // when
        List<Movie> movies = repository.findByName(movie.getName());
        Movie found = movies.get(0);

        // then
        assertThat(movie.getName(), is(equalTo(found.getName())));
    }

}
