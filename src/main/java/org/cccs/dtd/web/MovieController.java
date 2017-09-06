package org.cccs.dtd.web;

import org.cccs.dtd.persistence.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller object
 * Created by craig on 03/09/2017.
 */

@Controller()
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @RequestMapping("/movies")
    String getMovies(Model model) {
        model.addAttribute("movies", repository.findAll());
        return "movies";
    }
}
