package org.cccs.dtd.web;

import org.cccs.dtd.AbstractJMockTestSupport;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.ui.Model;

/**
 * Unit test for MovieController
 * Created by craig on 04/09/2017.
 */
public class TestMovieController extends AbstractJMockTestSupport {

    private Model model;

    @Before
    public void setup() {
        model = mock(Model.class);
        confirmExpectations();
    }

    @Ignore
    @Test
    public void getMoviesShouldWork() {
        one(model).addAttribute("movies", anything());
        will(returnValue(aNonNull(Model.class)));
        confirmExpectations();
        new MovieController().getMovies(model);
    }
}
