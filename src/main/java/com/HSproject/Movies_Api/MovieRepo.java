package com.HSproject.Movies_Api;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {
 
    public Optional<Movie> findByimdbId(String imdbId);
}
