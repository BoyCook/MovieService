package org.cccs.dtd.web;

import org.cccs.dtd.cache.Store;
import org.cccs.dtd.domain.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller object
 * Created by craig on 03/09/2017.
 */

@Controller
public class MovieController {

    private Store store;

    public MovieController() {
        this.store = new Store();
        this.store.addItem(new Movie("Star Wars IV", "A New Hope"));
        this.store.addItem(new Movie("Star Wars V", "The Empire Strikes Back"));
        this.store.addItem(new Movie("Star Wars VI", "Return of the Jedi"));
        this.store.addItem(new Movie("Star Wars I", "The Phantom Menace"));
    }

    @RequestMapping("/movies")
    String home(Model model) {
        model.addAttribute("movies", store.getAll());
        return "movies";
    }
}
