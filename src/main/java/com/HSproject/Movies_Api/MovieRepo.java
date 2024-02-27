package com.HSproject.Movies_Api;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

}
