package com.HSproject.Movies_Api;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    // @Autowired //field Injection
    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> allMovies() {
        return movieRepo.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepo.findById(id);
    }
    public Optional<Movie> singleMovieByImdbId(String imdbId) {
        return movieRepo.findByimdbId(imdbId);
    }
}
