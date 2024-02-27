package com.HSproject.Movies_Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    // @Autowired //field Injection
    @Autowired
    private MovieRepo movieRepo;

    // constructor injection
    // private MovieRepo movieRepo;
    // private MovieService() {
    //     this.movieRepo = movieRepo;
    // }

    public List<Movie> allMovies() {
        return movieRepo.findAll();
    }
}
