package org.cccs.dtd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Controller object
 * Created by craig on 03/09/2017.
 */

@Deprecated
@Controller
public class MovieController {

    @Autowired
    private MovieRepository repository;

    String getMovies(Model model) {
        return "movie";
    }
}
