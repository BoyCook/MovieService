package org.cccs.dtd.persistence;

import org.cccs.dtd.domain.Movie;
import org.cccs.dtd.persistence.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MovieRepository repository;

    @Autowired
    public DataLoader(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Movie("Star Wars I", "The Phantom Menace"));
        this.repository.save(new Movie("Star Wars II", "Attack of the Clone"));
        this.repository.save(new Movie("Star Wars III", "Revenge of the Sith"));
        this.repository.save(new Movie("Star Wars IV", "A New Hope"));
        this.repository.save(new Movie("Star Wars V", "The Empire Strikes Back"));
        this.repository.save(new Movie("Star Wars VI", "Return of the Jedi"));
    }
}
